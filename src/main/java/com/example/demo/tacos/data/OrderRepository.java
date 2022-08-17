package com.example.demo.tacos.data;

import com.example.demo.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
