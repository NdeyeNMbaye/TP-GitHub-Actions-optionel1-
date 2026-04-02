package com.groupeisi.achatenlignems.dto;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchatsDto implements Serializable{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    private Date dateP;
    private Double quantity;
    private ProduitsDto product;
    private UserAccountDto user;
}