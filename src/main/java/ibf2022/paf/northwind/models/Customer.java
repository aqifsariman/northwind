package ibf2022.paf.northwind.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;

    private String company;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String jobTitle;

    private String address;
}
