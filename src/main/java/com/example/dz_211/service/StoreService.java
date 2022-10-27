package com.example.dz_211.service;

import com.example.dz_211.component.Basket;
import com.example.dz_211.model.Item;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }
    private Map<Integer, Item> items = Map.of(
            1,new Item(1, "iphone 12 mini",65_000),
            2, new Item(2, "redmi 9", 12_000),
            3, new Item(3,"samsung galaxy A33", 25_000),
            4, new Item(4,"huawei nova Y70", 14_000),
            5, new Item(5,"honor 50", 35_000)
    );

    public void add(List<Integer> ids) {
        ids.stream()
                .map(id -> items.get(id))
                .collect(Collectors.toList());
    }

    public Collection<Item> get() {
        return basket.get();
    }
}
