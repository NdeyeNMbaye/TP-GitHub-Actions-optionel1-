package com.groupeisi.achatenlignems.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.Date;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentesDto implements Serializable{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    private Date dateP;
    private Double quantity;
    private ProduitsDto product;
    private UserAccountDto user;
}