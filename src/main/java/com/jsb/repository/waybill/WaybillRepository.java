package com.jsb.repository.waybill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsb.entity.waybill.Waybill;

import java.util.Optional;

public interface WaybillRepository extends JpaRepository<Waybill, Long>, JpaSpecificationExecutor<Waybill> {

    @Query("SELECT w FROM Waybill w WHERE w.order.id = :orderId")
    Optional<Waybill> findByOrderId(@Param("orderId") Long orderId);

    Optional<Waybill> findByCode(String code);

    @Query("SELECT COUNT(w.id) FROM Waybill w")
    int countByWaybillId();

}
