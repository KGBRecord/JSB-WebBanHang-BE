package com.phucanhduong.dto.employee;

import com.phucanhduong.dto.address.AddressRequest;
import lombok.Data;

@Data
public class OfficeRequest {
    private String name;
    private AddressRequest address;
    private Integer status;
}
