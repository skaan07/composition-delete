package trendyol.compositiondelete.model;

import lombok.Data;

@Data
public class CountryInfo extends Deletable{

    private String countryCode;

    private String name;

    private String currency;
}
