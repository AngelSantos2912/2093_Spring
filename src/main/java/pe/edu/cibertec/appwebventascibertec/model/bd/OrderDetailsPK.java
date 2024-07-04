package pe.edu.cibertec.appwebventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
public class OrderDetailsPK {
    private Integer orderid;
    private Integer productid;
}
