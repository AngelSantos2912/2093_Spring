package pe.edu.cibertec.appwebventascibertec.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {
    private Integer orderid;
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
    private Integer customerid;
    private Integer employeeid;
    private Integer productid;
    private Integer quantity;
    private Double discount;
}
