package model.service;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductService {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public List<Product> getAllProducts() {
            return products;
        }
}
