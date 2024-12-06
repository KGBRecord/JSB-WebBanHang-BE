package com.phucanhduong.projection.inventory;

import com.phucanhduong.entity.inventory.DocketVariant;
import com.phucanhduong.entity.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductInventory {
    private Product product;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
