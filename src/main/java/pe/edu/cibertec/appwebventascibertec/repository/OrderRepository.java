package pe.edu.cibertec.appwebventascibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.appwebventascibertec.model.bd.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {


}
