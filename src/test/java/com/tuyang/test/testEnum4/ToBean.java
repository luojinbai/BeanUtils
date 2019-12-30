package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyFeature;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = FromBean.class, features = {CopyFeature.IGNORE_ALL_NULL_SOURCE_VALUE})
public class ToBean {

    @CopyProperty
//    @CopyProperty(ignored = true)
    private int a;
    @CopyProperty
//    @CopyProperty(ignored = true)
    private MyEnum b;
    @CopyProperty
//    @CopyProperty(ignored = true)
    private MyEnum c;
    //    @CopyProperty(ignored = true)
    private String d;
    @CopyProperty(ignored = true)
    private Integer e;
    //    @CopyProperty(ignored = true)
//    @CopyProperty
    private int f;

}
