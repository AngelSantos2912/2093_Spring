package pe.edu.cibertec.appwebventascibertec.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.appwebventascibertec.model.bd.Order;
import pe.edu.cibertec.appwebventascibertec.service.IOrdenService;

import java.util.List;

@RequestMapping("/orders")
@AllArgsConstructor
@Controller
public class OrderController {
    private IOrdenService ordenService;

    @GetMapping(value = "/init")
    public String orders(Model model) {
        model.addAttribute("ordenes", ordenService.obtenerOrders());
        return "backoffice/order/frmorder";
    }

    @GetMapping("/listOrder")
    @ResponseBody
    public List<Order> ListOrder(){
        return ordenService.listOrders();
    }

}
