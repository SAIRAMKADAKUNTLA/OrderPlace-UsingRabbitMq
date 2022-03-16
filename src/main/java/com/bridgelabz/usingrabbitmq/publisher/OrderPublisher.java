package com.bridgelabz.usingrabbitmq.publisher;

import com.bridgelabz.usingrabbitmq.configuaration.MessageConfig;
import com.bridgelabz.usingrabbitmq.dto.Order;
import com.bridgelabz.usingrabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{name}")
    public String bookOrder(@RequestBody Order order, @PathVariable String name){
        order.setOrder_id(UUID.randomUUID().toString());
        OrderStatus orderStatus=new OrderStatus(order,"PROCESS","ORDER PLACED SUCCESSFULLY IN "+name);
        template.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,orderStatus);
        return "ORDER SUCCESS!!!";
    }
}
