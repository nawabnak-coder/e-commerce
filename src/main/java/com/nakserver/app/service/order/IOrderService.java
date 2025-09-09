package com.nakserver.app.service.order;

import com.nakserver.app.dto.OrderDto;
import com.nakserver.app.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
