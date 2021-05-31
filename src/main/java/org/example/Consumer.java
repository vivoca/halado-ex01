package org.example;

import org.example.exception.StoreEmptyException;

public class Consumer {

    private StoreReaderInterface store;

    public Consumer() {
        store = new Store();
    }

    public Product consume(int product) throws StoreEmptyException {
        return store.remove(product);
    }

}
