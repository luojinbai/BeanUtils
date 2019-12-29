package com.tuyang.beanutils.internal.convertors;

import com.tuyang.beanutils.BeanCopyConvertor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yibai on 2019-12-30.
 */
public class IntToEnumConvertor implements BeanCopyConvertor<Integer, Enum> {

    /*** 目标enum的class类型 */
    private Class targetEnumClass;

    public IntToEnumConvertor(Class targetEnumClass) {
        this.targetEnumClass = targetEnumClass;
    }

    @Override
    public Enum convertTo(Integer object) {
        if (object == null) {
            return null;
        }
        try {
            Method valueOf = targetEnumClass.getMethod("valueOf", Integer.class);
            return (Enum) valueOf.invoke(null, object);
        } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
