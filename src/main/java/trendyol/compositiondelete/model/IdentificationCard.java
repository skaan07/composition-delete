package trendyol.compositiondelete.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IdentificationCard extends Deletable {

    private String cardNumber;

    private Date expireDate;
}
