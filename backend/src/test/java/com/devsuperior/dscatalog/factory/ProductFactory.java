package com.devsuperior.dscatalog.factory;

import com.devsuperior.dscatalog.dtos.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import java.time.Instant;

public class ProductFactory {
    public static Product createProduct() {
        Product product = new Product(Instant.parse("2020-10-20T03:00:00Z"), "https://img.com/img.png", 800.0, "Good Phone", "Phone", 1L);
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = new Product(Instant.parse("2020-10-20T03:00:00Z"), "https://img.com/img.png", 900.0, "Good Notebook", "Notebok",2L);
        product.getCategories().add(CategoryFactory.createCategory());
        return new ProductDTO(product, product.getCategories());
    }

}
