package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.BeanCopyConvertor;

public class Enum2IntConvertor implements BeanCopyConvertor<Enum, Integer> {

    @Override
    public Integer convertTo(Enum object) {
        return null;
    }
}
