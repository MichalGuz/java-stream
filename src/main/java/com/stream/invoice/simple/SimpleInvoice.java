package com.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem item){
        items.add(item);
    }
}
