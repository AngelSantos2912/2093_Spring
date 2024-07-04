package pe.edu.cibertec.appwebventascibertec.service;

import pe.edu.cibertec.appwebventascibertec.model.bd.Order;

import java.util.List;

public interface IOrdenService {
    List<Order> obtenerOrders();
    void guardarOrden(Order order);
    Order buscarOrden(int id);
}
