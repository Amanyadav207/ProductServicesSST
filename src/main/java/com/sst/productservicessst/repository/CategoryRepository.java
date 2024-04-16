package com.sst.productservicessst.repository;

import com.sst.productservicessst.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Override
    Category save(Category category);
}
