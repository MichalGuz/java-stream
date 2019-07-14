package com.stream.bigdecimal;

import java.math.BigDecimal;

public final class Australia implements SandStorage{
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("1234567890123456789");
        return sandQuantity;
    }
}
