package com.sst.productservicessst.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    private Long  id;
    private String tittle;
    private String description;
    private Double price;
    @ManyToOne
    private Category category;
    private String image;

}
