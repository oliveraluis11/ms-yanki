package com.bootcamp.yankitransferservice.documents.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class YankiDTO{
    private String id;
    private String ownerName;
    private String phoneNumber;
    private Double amount;
}
