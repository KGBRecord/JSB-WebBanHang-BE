package com.phucanhduong.repository.address;

import com.phucanhduong.entity.address.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WardRepository extends JpaRepository<Ward, Long>, JpaSpecificationExecutor<Ward> {}
