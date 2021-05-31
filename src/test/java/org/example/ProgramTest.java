package org.example;

import org.example.ex03.Consumer;
import org.example.ex03.Product;
import org.example.ex03.Store;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ProgramTest {


    @Test
    public void testCase1() throws Exception {
        Store store = new Store();
        Product product = new Product();
        product.setId("p0");
        product.setName("p0");
        store.add(product);

//        Store storeMock = Mockito.mock(Store.class);
//        Mockito.when(storeMock.getProductCount()).thenReturn(1);
//        System.out.println("Store mock count: " + storeMock.getProductCount());

        Consumer consumer = new Consumer(store);
        assertEquals("p0", consumer.consume(0).getId());
    }
}
