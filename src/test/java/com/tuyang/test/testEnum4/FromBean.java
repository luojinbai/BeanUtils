package com.tuyang.test.testEnum4;


import com.tuyang.beanutils.annotation.BeanCopySource;
import com.tuyang.beanutils.annotation.CopyFeature;
import com.tuyang.beanutils.annotation.CopyProperty;
import lombok.Data;

@Data
@BeanCopySource(source = ToBean.class,features={CopyFeature.IGNORE_PRIMITIVE_NULL_SOURCE_VALUE})
public class FromBean {
    @CopyProperty
    private MyEnum a;
    @CopyProperty
    private int b;
    @CopyProperty
    private String c;
    private String d;
    private int e;
    private Integer f;
}
