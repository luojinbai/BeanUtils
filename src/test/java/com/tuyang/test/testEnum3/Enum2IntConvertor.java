package com.tuyang.test.testEnum3;


import com.tuyang.beanutils.BeanCopyConvertor;

public class Enum2IntConvertor implements BeanCopyConvertor<MyEnum, Integer> {

    @Override
    public Integer convertTo(MyEnum object) {
        return object.getValue();
    }
}
