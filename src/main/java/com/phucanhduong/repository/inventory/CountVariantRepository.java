package com.phucanhduong.repository.inventory;

import com.phucanhduong.entity.inventory.CountVariant;
import com.phucanhduong.entity.inventory.CountVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountVariantRepository extends JpaRepository<CountVariant, CountVariantKey>,
        JpaSpecificationExecutor<CountVariant> {}
