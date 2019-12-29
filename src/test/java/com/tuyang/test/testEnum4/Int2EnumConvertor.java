package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.BeanCopyConvertor;

public class Int2EnumConvertor<E> implements BeanCopyConvertor<Integer, E> {

    @Override
    public E convertTo(Integer object) {
        return (E) IEnumConvertor.valueOf(object);
    }
}
