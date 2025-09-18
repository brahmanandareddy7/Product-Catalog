package com.mrr.ecom.service;


import com.mrr.ecom.dto.Category;
import com.mrr.ecom.dto.ProductRequest;
import com.mrr.ecom.model.Product;
import com.mrr.ecom.repository.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {

    @Mock
    ProductRepo productRepo;

    @InjectMocks
    ProductServiceImpl productService;
  //  private static Product product = null;


    @Test
    void saveProductShouldAddProductSuccessfully() {
        ProductRequest productRequest = new ProductRequest(
                "jacket",
                "Black jacket to style with tshirt",
                new BigDecimal("9000.00"),

                20,
                Category.FASHION
        );
        Product product = new Product(
                1L,
                "jacket",
                "Black jacket to style with tshirt",
                new BigDecimal("9000.00"),

                20, Category.FASHION.name()
        );
        Mockito.when(productRepo.save(product)).thenReturn(product);
        String addeddproduct=productService.saveProduct(product);
        Assertions.assertEquals(1,product.getId());
        Assertions.assertEquals("Product added successfully",addeddproduct);
    }
}
