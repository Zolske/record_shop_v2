package com.zoltan.record_shop_api.controller;

import com.zoltan.record_shop_api.model.StockItem;
import com.zoltan.record_shop_api.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/recordStock")
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping
    public ResponseEntity<List<StockItem>> getAllStockItems() {
        return new ResponseEntity<List<StockItem>>(stockService.getStockItems(), HttpStatus.OK);
    }
}
