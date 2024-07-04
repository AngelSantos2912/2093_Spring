package pe.edu.cibertec.appwebventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    private LocalDate orderdate;
    private LocalDate requireddate;
    private LocalDate shippeddate;
    private String shipvia;
    private String freight;
    private String shipname;
    private String shipaddress;
    private String shipcity;
    private String shipregion;
    private String shippostalcode;
    private String shipcountry;
    private String customerid;
    private Integer employeeid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerid", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FKcustomertoorder"))
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeid", insertable = false, updatable = false)
    private Employee employee;
}
