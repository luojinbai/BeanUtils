package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = FromBean.class)
public class ToBean {

    @CopyProperty(convertor = Enum2IntConvertor.class, ignored = true)
    private int a;
    @CopyProperty(convertor = Int2EnumConvertor.class)
    private MyEnum b;
}
