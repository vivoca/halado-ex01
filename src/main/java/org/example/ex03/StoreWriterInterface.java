package org.example.ex03;

import org.example.exception.StoreFullException;

public interface StoreWriterInterface {
	void add(Product product) throws StoreFullException;
}
