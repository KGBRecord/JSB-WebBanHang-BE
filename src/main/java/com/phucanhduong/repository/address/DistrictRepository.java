package com.phucanhduong.repository.address;

import com.phucanhduong.entity.address.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DistrictRepository extends JpaRepository<District, Long>, JpaSpecificationExecutor<District> {
}
