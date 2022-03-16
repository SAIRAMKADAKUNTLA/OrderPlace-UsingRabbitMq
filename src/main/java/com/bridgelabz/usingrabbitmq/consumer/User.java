//package com.bridgelabz.usingrabbitmq.consumer;
//
//import com.bridgelabz.usingrabbitmq.configuaration.MessageConfig;
//import com.bridgelabz.usingrabbitmq.dto.OrderStatus;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class User {
//    @RabbitListener(queues = MessageConfig.QUEUE)
//    public  void consumeMessageFromQueue(OrderStatus orderStatus){
//        log.info("Message received from queue "+orderStatus);
//
//    }
//}
