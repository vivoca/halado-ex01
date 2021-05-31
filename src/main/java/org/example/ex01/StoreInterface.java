package org.example.ex01;

public interface StoreInterface extends StoreReaderInterface, StoreWriterInterface {
    public void reset();
    public int getProductCount();
}
