package org.example;

import org.example.exception.StoreFullException;

public class Producer {

    private StoreWriterInterface store;

    public Producer() {
        store = new Store();
    }

    public void produce(String productName, String productId) throws StoreFullException {
        store.add(new Product(productName, productId));
    }

}
