package com.phucanhduong.projection.inventory;

import com.phucanhduong.entity.inventory.DocketVariant;
import com.phucanhduong.entity.product.Variant;
import lombok.Data;

import java.util.List;

@Data
public class VariantInventory {
    private Variant variant;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
