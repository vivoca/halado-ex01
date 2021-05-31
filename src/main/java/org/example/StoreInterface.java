package org.example;

public interface StoreInterface extends StoreReaderInterface, StoreWriterInterface {
    public void reset();
    public int getProductCount();
}
