package com.jsb.projection.inventory;

import lombok.Data;

import java.util.List;

import com.jsb.entity.inventory.DocketVariant;
import com.jsb.entity.product.Variant;

@Data
public class VariantInventory {
    private Variant variant;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
