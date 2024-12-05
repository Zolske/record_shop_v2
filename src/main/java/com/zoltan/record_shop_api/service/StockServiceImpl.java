package com.zoltan.record_shop_api.service;

import com.zoltan.record_shop_api.model.StockItem;
import com.zoltan.record_shop_api.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<StockItem> getStockItems(){
        List<StockItem> stockItems = new ArrayList<>();
        stockRepository.findAll().forEach(stockItems::add);
        return stockItems;
    }
}
