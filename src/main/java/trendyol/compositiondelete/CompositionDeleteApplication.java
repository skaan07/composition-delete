package trendyol.compositiondelete;

import trendyol.compositiondelete.model.Address;
import trendyol.compositiondelete.model.Company;
import trendyol.compositiondelete.model.CountryInfo;
import trendyol.compositiondelete.model.IdentificationCard;
import trendyol.compositiondelete.model.Person;

import java.util.List;

public class CompositionDeleteApplication {

    public static void main(String[] args) {
        CountryInfo turkey = new CountryInfo();

        Company company = new Company();
        Address address1 = new Address();
        IdentificationCard idCard1 = new IdentificationCard();
        Person employee1 = new Person();
        employee1.setAddress(address1);
        employee1.setIdentificationCard(idCard1);
        Person employee2 = new Person();
        Address address2 = new Address();
        IdentificationCard idCard2 = new IdentificationCard();
        employee2.setAddress(address2);
        employee2.setIdentificationCard(idCard2);
        company.setEmployeeList(List.of(employee1, employee2));
        company.setCountryInfo(turkey);

        company.setDeleted(true);
        System.out.println(company);


    }

}
