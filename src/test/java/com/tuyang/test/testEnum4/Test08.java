package com.tuyang.test.testEnum4;

import com.tuyang.beanutils.BeanCopyUtils;
import org.junit.Test;

public class Test08 {

    private FromBean getFromBean() {

        FromBean fromBean = new FromBean();
        fromBean.setA(MyEnum.One);
        fromBean.setB(2);
        return fromBean;
    }

    @Test
    public void testEnum() {
        FromBean fromBean = getFromBean();
        System.out.println(fromBean);
        ToBean toBean = BeanCopyUtils.copyBean(fromBean, ToBean.class);
        System.out.println(toBean);

    }
}

