package com.phucanhduong.repository.inventory;

import com.phucanhduong.entity.inventory.PurchaseOrderVariant;
import com.phucanhduong.entity.inventory.PurchaseOrderVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PurchaseOrderVariantRepository extends JpaRepository<PurchaseOrderVariant, PurchaseOrderVariantKey>,
        JpaSpecificationExecutor<PurchaseOrderVariant> {}
