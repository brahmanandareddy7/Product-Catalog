package com.mrr.ecom.service;

import com.mrr.ecom.dto.Category;
import com.mrr.ecom.exception.CategoryNotFoundException;
import com.mrr.ecom.model.Product;
import com.mrr.ecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public String saveProduct(Product productDTO) {
        boolean isCategory = isCategoryPresent(productDTO.getCategory());
        if (isCategory) {
            Product product = new Product(
                    productDTO.getName(),
                    productDTO.getDescription(),
                    productDTO.getPrice(),
                    productDTO.getQuantity(),
                    productDTO.getCategory()
            );
            productRepo.save(product);
            return "Product added successfully";
        } else
            throw new CategoryNotFoundException("Category Not Found with Give Product ");

    }

    private boolean isCategoryPresent(String category) {
        boolean isCategoryPresent = false;
        Category[] categories=Category.values();
        for (Category category1:categories){
           if(category1.equals(category)) isCategoryPresent=true;
        }
        System.out.println("isCategoryPresent : " + isCategoryPresent);
        return isCategoryPresent;
    }
}
