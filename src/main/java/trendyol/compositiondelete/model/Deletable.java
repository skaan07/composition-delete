package trendyol.compositiondelete.model;

import lombok.Data;
import trendyol.compositiondelete.annotation.NonCascade;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

@Data
public class Deletable {

    protected boolean deleted;

    public void setDeleted(boolean deleted) {
        if (!this.deleted && deleted) {
            deleteCompositeProperties();
        }
        this.deleted = deleted;
    }

    public void deleteCompositeProperties() {
        Arrays.stream(this.getClass().getDeclaredFields()).forEach((Field field) -> {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Illegal access through deletion operation reflection");
            }
            if (Arrays.stream(field.getDeclaredAnnotations()).noneMatch(item -> item.annotationType().equals(NonCascade.class))) {
                if (value instanceof Deletable) {
                    Deletable entity = (Deletable) value;
                    if (!entity.isDeleted()) {
                        entity.setDeleted(true);
                    }
                } else if (value instanceof Collection<?> && !((Collection<?>) value).isEmpty()) {
                    Collection<?> set = (Collection<?>) value;
                    set.forEach(item -> {
                        if (item instanceof Deletable) {
                            Deletable entity = (Deletable) item;
                            entity.setDeleted(true);
                        }
                    });

                }
            }
        });
    }
}
