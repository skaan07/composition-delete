package trendyol.compositiondelete.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Person extends Deletable {

    private Address address;

    private IdentificationCard identificationCard;

}
