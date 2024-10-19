package vatsify.io.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vatsify.io.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
