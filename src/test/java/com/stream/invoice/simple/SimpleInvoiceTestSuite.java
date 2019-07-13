package com.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay(){
        // given
        SimpleInvoice simpleInvoice = new SimpleInvoice();

        // when
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product1", 15.02), 2));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("product2", 14.84), 3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("product3", 8.42), 4.2));

        // then
        Assert.assertEquals(117.344, simpleInvoice.getValueToPay(), 0);
    }
}
