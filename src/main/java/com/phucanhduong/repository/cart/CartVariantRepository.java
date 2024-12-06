package com.phucanhduong.repository.cart;

import com.phucanhduong.entity.cart.CartVariant;
import com.phucanhduong.entity.cart.CartVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartVariantRepository extends JpaRepository<CartVariant, CartVariantKey>,
        JpaSpecificationExecutor<CartVariant> {}
