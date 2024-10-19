package vatsify.io.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vatsify.io.order.dto.OrderRequest.OrderRequest;
import vatsify.io.order.model.Order;
import vatsify.io.order.repository.OrderRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    }
}
