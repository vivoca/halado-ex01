package org.example.ex03;

import org.example.exception.StoreEmptyException;

public interface StoreReaderInterface {
	Product remove(int index) throws StoreEmptyException;
}
