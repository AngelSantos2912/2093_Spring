package pe.edu.cibertec.appwebventascibertec.model.bd;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "orderdetails")
public class OrdeDetail {
    @EmbeddedId
    private OrderDetailsPK pk;
    @Column(name = "unitprice")
    private Integer unitprice;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "discount")
    private Double discount;
}
