package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = FromBean.class)
public class ToBean {

    @CopyProperty
    private int a;
    @CopyProperty
    private MyEnum b;
}
