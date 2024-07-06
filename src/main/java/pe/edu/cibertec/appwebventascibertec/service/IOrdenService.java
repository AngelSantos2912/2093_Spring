package pe.edu.cibertec.appwebventascibertec.service;

import pe.edu.cibertec.appwebventascibertec.model.bd.Order;

import java.util.List;

public interface IOrdenService {
    
    void guardarOrden(Order order);
    List<Order> listOrders();

    Object obtenerOrders();
}
