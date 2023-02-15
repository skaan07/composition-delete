package trendyol.compositiondelete.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Address extends Deletable {

    private String city;

    private String country;

    private String district;

    private String addressLine;

}
