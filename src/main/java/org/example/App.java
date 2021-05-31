package org.example;

import org.example.ex01.Producer;
import org.example.exception.StoreFullException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Producer producer = new Producer();
        try {
            producer.produce("productName01", "productId01");
            producer.produce("productName02", "productId02");
        } catch (StoreFullException e) {
            e.printStackTrace();
        }

    }
}
