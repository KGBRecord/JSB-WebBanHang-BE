package com.jsb.controller.order;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jsb.constant.AppConstants;
import com.jsb.service.order.OrderService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class OrderController {

    private OrderService orderService;

    @PutMapping("/cancel/{code}")
    public ResponseEntity<ObjectNode> cancelOrder(@PathVariable String code) {
        orderService.cancelOrder(code);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

}
