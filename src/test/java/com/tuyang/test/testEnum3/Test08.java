package com.tuyang.test.testEnum3;

import com.tuyang.beanutils.BeanCopyUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test08 {

    private FromBean getFromBean() {

        FromBean fromBean = new FromBean();
        fromBean.setA(MyEnum.One);
        fromBean.setB(2);
        fromBean.setC(MyEnum.Three.toString());
        fromBean.setEe("hello convertor");
        return fromBean;
    }

    @Test
    public void testEnum() {
        FromBean fromBean = getFromBean();
        System.out.println(fromBean);

        ToBean toBean = BeanCopyUtils.copyBean(fromBean, ToBean.class);

        assertEquals(toBean.getA(), MyEnum.One.getValue());
        assertEquals(toBean.getB(), MyEnum.Two);
        assertEquals(toBean.getC(), MyEnum.Three);

        System.out.println(toBean);

    }
}

