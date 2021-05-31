package org.example.ex03;

public interface StoreInterface extends StoreReaderInterface, StoreWriterInterface {
	public void reset();
	public int getProductCount();
}
