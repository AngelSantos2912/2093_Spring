package pe.edu.cibertec.appwebventascibertec.model.bd;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "customers")

public class Customer {

    @Id
    private String customerId;
    @Column(name = "CompanyName")
    private String companyName;
    @Column(name ="ContactName")
    private String contactName;
    @Column(name = "ContactTitle")
    private String contactTitle;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "Country")
    private String country;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Fax")
    private String fax;


}
