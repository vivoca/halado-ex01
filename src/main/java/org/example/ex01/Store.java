package org.example.ex01;

import org.example.exception.StoreEmptyException;
import org.example.exception.StoreFullException;

import java.util.ArrayList;
import java.util.List;

public class Store implements StoreInterface {
    private List<Product> productList;
    private int maxCount = 20;


    public Store() {
        productList = new ArrayList<>();
    }


    public void add(Product product) throws StoreFullException {
        if (productList.size() + 1 > maxCount) {
        	throw new StoreFullException("Store is full");
		} else {
            productList.add(product);
        }
    }

    public Product remove(int index) throws StoreEmptyException {
        if (productList.size() == 0) {
        	throw new StoreEmptyException("Store is empty");
		} else {
            Product element = productList.get(index);
            productList.remove(index);
            return element;
        }
    }

    public void reset() {
        productList.clear();
    }

    public int getProductCount() {
        return productList.size();
    }

}
