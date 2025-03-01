package model.util;

import model.Product;
import model.service.controller.ProductController;

public class Main {
      public static void main(String[] args) {
            ProductController controller = new ProductController();
            controller.addProduct(new Product(1, "Laptop", 1200.00));
            controller.addProduct(new Product(2, "Mouse", 25.00));
            controller.listProducts();
        }
}
