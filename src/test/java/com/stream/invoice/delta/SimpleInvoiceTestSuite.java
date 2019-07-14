package com.stream.invoice.delta;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay(){
        // given
        SimpleInvoice simpleInvoice = new SimpleInvoice();

        // when
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product1", 15.98), 2));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("product2", 14.84), 3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("product3", 8.49), 4.2));

        // then
        Assert.assertEquals(119.557, simpleInvoice.getValueToPay(), 0.001);
    }
}
