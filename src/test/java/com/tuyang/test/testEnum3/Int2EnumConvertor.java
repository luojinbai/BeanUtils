package com.tuyang.test.testEnum3;


import com.tuyang.beanutils.BeanCopyConvertor;

public class Int2EnumConvertor implements BeanCopyConvertor<Integer, MyEnum> {

    @Override
    public MyEnum convertTo(Integer object) {
        return MyEnum.valueOf(object);
    }
}
