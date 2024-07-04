package pe.edu.cibertec.appwebventascibertec.model.bd;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    private Integer employeeid;
    private String lastname;
    private String firstname;
    private String title;
    private String titleofcourtesy;
    private String birthdate;
    private String hiredate;
    private String address;
    private String city;
    private String region;
    private String postalcode;
    private String country;
    private String homephone;
    private String extension;
    private String notes;
    private String reportsto;
    private String photopath;
    private String salary;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;
}
