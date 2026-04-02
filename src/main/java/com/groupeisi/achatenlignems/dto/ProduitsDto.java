package com.groupeisi.achatenlignems.dto;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitsDto implements Serializable{

    private String ref;
    private String name;
    private Double stock;
    private UserAccountDto user;
}