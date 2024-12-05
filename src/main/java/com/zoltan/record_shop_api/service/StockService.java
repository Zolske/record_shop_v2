package com.zoltan.record_shop_api.service;

import com.zoltan.record_shop_api.model.StockItem;
import java.util.List;

public interface StockService {
    List<StockItem> getStockItems();
}
