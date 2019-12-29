package com.tuyang.test.testEnum3;


import com.tuyang.beanutils.BeanCopyConvertor;

import java.util.Optional;

public class Integer2IntConvertor implements BeanCopyConvertor<Integer, Integer> {

    @Override
    public Integer convertTo(Integer object) {
        return Optional.ofNullable(object).map(o -> o.intValue()).orElse(0);
    }
}
