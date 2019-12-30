package com.tuyang.beanutils.internal.convertors;

import com.tuyang.beanutils.BeanCopyConvertor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@SuppressWarnings("rawtypes")
public class EnumToIntConvertor implements BeanCopyConvertor<Enum, Integer> {

    /*** 源enum的class类型 */
    private Class sourceEnumClass;

    public EnumToIntConvertor(Class sourceEnumClass) {
        this.sourceEnumClass = sourceEnumClass;
    }

    @Override
    public Integer convertTo(Enum object) {
        try {
            Method getValue = sourceEnumClass.getMethod("getValue");
            return (Integer) getValue.invoke(object);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

}
