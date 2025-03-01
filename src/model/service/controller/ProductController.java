package model.service.controller;

import model.Product;
import model.service.ProductService;

public class ProductController {
    private ProductService productService = new ProductService();

        public void addProduct(Product product) {
            productService.addProduct(product);
        }

        public void listProducts() {
            for (Product product : productService.getAllProducts()) {
                System.out.println(product);
            }
        }
}
