package com.phucanhduong.repository.product;

import com.phucanhduong.entity.product.Guarantee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GuaranteeRepository extends JpaRepository<Guarantee, Long>, JpaSpecificationExecutor<Guarantee> {
}