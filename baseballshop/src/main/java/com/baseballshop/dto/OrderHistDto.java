package com.baseballshop.dto;

import com.baseballshop.constant.OrderStatus;
import com.baseballshop.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OrderHistDto {

    private Long orderId;
    private String orderMemberId;

    private String orderDate;

    private OrderStatus orderStatus;

    private int orderTotalPrice;

    private List<OrderItemDto> orderItemDtoList = new ArrayList<>();

    public OrderHistDto(Order order){
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate();
        this.orderStatus = order.getOrderStatus();
        this.orderTotalPrice = order.getTotalPrice();
        //this.orderMemberId = order.getOrderMemberId();
        String[] orderMemId=order.getMember().getEmail().split("@");
        this.orderMemberId=orderMemId[0];
    }

    public void addOrderItemDto(OrderItemDto orderItemDto){
        orderItemDtoList.add(orderItemDto);
    }
}
