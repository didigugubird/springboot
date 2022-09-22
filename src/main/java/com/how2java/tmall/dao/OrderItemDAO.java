package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    //根据订单来获取订购的物品
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    //根据产品获取订购的物品,在OrderItemService里用来显示该产品被订购的总数
    List<OrderItem> findByProduct(Product product);
}
