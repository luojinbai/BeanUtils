package com.tuyang.test.testEnum3;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyFeature;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = FromBean.class,features = CopyFeature.IGNORE_PRIMITIVE_NULL_SOURCE_VALUE)
public class ToBean {

    @CopyProperty(convertor = Enum2IntConvertor.class)
    private int a;
    @CopyProperty(convertor = Int2EnumConvertor.class)
    private MyEnum b;
    @CopyProperty
    private MyEnum c;
    private int d;
    @CopyProperty(property = "ee")
    private String e;
}
