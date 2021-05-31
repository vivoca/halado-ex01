package org.example.ex03;

import org.example.exception.StoreEmptyException;

public class Consumer {

	private Store store;

	public Consumer(Store store) {
		this.store = store;
	}

	public Product consume(int product) throws StoreEmptyException {
		return store.remove(product);
	}

}
