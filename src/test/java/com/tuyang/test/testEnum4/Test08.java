package com.tuyang.test.testEnum4;

import com.tuyang.beanutils.BeanCopyUtils;
import org.junit.Test;

public class Test08 {

    private FromBean getFromBean() {

        FromBean fromBean = new FromBean();
        fromBean.setA(MyEnum.One);
        fromBean.setB(2);
        fromBean.setC(MyEnum.Three.toString());
        fromBean.setD("d");
        fromBean.setE(10);
        fromBean.setF(1000);
        return fromBean;
    }

    @Test
    public void testEnum() {
        FromBean fromBean = getFromBean();
        System.out.println(fromBean);
        ToBean toBean = BeanCopyUtils.copyBean(fromBean, ToBean.class);
        System.out.println(toBean);

//        System.out.println(BeanCopyUtils.copyBean(toBean, FromBean.class));


    }
}

