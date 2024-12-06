package com.jsb.dto.inventory;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.dto.address.AddressResponse;

import java.time.Instant;

@Data
public class DestinationResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    @Nullable
    private String contactFullname;
    @Nullable
    private String contactEmail;
    @Nullable
    private String contactPhone;
    private AddressResponse address;
    private Integer status;
}
