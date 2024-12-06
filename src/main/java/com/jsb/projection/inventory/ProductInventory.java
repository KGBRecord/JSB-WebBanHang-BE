package com.jsb.projection.inventory;

import lombok.Data;

import java.util.List;

import com.jsb.entity.inventory.DocketVariant;
import com.jsb.entity.product.Product;

@Data
public class ProductInventory {
    private Product product;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
