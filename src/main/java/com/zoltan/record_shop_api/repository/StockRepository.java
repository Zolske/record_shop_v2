package com.zoltan.record_shop_api.repository;

import com.zoltan.record_shop_api.model.StockItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockItem, Long> {
}
