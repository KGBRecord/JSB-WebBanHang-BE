package com.jsb.repository.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.jsb.entity.inventory.ProductInventoryLimit;

public interface ProductInventoryLimitRepository extends JpaRepository<ProductInventoryLimit, Long>,
        JpaSpecificationExecutor<ProductInventoryLimit> {}
