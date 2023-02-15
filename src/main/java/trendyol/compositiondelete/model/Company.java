package trendyol.compositiondelete.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import trendyol.compositiondelete.annotation.NonCascade;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Company extends Deletable {

    private List<Person> employeeList;

    @NonCascade
    private CountryInfo countryInfo;

}
