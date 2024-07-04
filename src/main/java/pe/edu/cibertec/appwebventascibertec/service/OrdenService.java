package pe.edu.cibertec.appwebventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebventascibertec.model.bd.Order;
import pe.edu.cibertec.appwebventascibertec.repository.OrderRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class OrdenService implements IOrdenService{
    private OrderRepository orderRepository;

    @Override
    public List<Order> obtenerOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void guardarOrden(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order buscarOrden(int id) {
        return orderRepository.findById(id).orElse(null);
    }
}
