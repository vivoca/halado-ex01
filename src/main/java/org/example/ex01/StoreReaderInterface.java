package org.example.ex01;

import org.example.exception.StoreEmptyException;

public interface StoreReaderInterface {
    Product remove(int index) throws StoreEmptyException;
}
