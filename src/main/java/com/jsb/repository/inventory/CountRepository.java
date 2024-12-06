package com.jsb.repository.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.jsb.entity.inventory.Count;

public interface CountRepository extends JpaRepository<Count, Long>, JpaSpecificationExecutor<Count> {}
