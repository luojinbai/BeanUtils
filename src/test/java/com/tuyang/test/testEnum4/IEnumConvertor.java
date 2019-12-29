package com.tuyang.test.testEnum4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by yibai on 2019-12-29.
 */
public interface IEnumConvertor {

    Map<Integer, Enum> MAP = new HashMap<>();

    static Enum valueOf(int value) {
        return Optional.ofNullable(MAP.get(value)).orElseThrow(() -> new RuntimeException(String.format("不支持的枚举类型,value:%s", value)));
    }
}
