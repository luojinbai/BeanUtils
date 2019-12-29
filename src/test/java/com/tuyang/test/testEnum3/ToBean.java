package com.tuyang.test.testEnum3;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = FromBean.class)
public class ToBean {

    @CopyProperty(convertor = Enum2IntConvertor.class)
    private int a;
    @CopyProperty(convertor = Int2EnumConvertor.class)
    private MyEnum b;
    @CopyProperty
    private MyEnum c;
    @CopyProperty(convertor = Integer2IntConvertor.class)
    private int d;
    @CopyProperty(property = "ee")
    private String e;
}
