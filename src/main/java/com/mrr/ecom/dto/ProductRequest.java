package com.mrr.ecom.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProductRequest {
    
    @NotNull(message = "Product name Can't be NULL")
    @Size(min = 5,message = "Character should be > 5")
    String name;
    @NotNull(message ="Product description is Mandatory")
    String description;
    @Digits(integer = 5, fraction = 2,message = "Price must have up to 6 integer digits and 2 fractional digits\"")
    BigDecimal price;
    @Min(value = 1,message = "Quantity minimum 1")
    int quantity;
    @NotNull(message = "Product Category can't be NULL")
    Category category;

    public ProductRequest(String name, String description, BigDecimal price, int quantity, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }


    /**
     * get field @NotNull(message = "Product name Can't be NULL")
     @Size(min = 5,message = "Character should be > 5")

      *
      * @return name @NotNull(message = "Product name Can't be NULL")
     @Size(min = 5,message = "Character should be > 5")

     */
    public String getName() {
        return this.name;
    }

    /**
     * set field @NotNull(message = "Product name Can't be NULL")
     @Size(min = 5,message = "Character should be > 5")

      *
      * @param name @NotNull(message = "Product name Can't be NULL")
     @Size(min = 5,message = "Character should be > 5")

     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field @NotNull(message ="Product description is Mandatory")
     *
     * @return description @NotNull(message ="Product description is Mandatory")

     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field @NotNull(message ="Product description is Mandatory")
     *
     * @param description @NotNull(message ="Product description is Mandatory")

     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get field @Digits(integer = 5, fraction = 2,message = "Price must have up to 6 integer digits and 2 fractional digits"")
     *
     * @return price @Digits(integer = 5, fraction = 2,message = "Price must have up to 6 integer digits and 2 fractional digits"")

     */
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * set field @Digits(integer = 5, fraction = 2,message = "Price must have up to 6 integer digits and 2 fractional digits"")
     *
     * @param price @Digits(integer = 5, fraction = 2,message = "Price must have up to 6 integer digits and 2 fractional digits"")

     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * get field @Min(value = 1,message = "Quantity minimum 1")
     *
     * @return quantity @Min(value = 1,message = "Quantity minimum 1")

     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * set field @Min(value = 1,message = "Quantity minimum 1")
     *
     * @param quantity @Min(value = 1,message = "Quantity minimum 1")

     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * get field @NotNull(message = "Product Category can't be NULL")
     *
     * @return category @NotNull(message = "Product Category can't be NULL")

     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * set field @NotNull(message = "Product Category can't be NULL")
     *
     * @param category @NotNull(message = "Product Category can't be NULL")

     */
    public void setCategory(Category category) {
        this.category = category;
    }
}
