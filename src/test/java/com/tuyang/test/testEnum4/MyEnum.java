package com.tuyang.test.testEnum4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum MyEnum {
    One(1),
    Two(2),
    Three(3);

    int value;

    public static final Map<Integer, MyEnum> MAP = new HashMap<>();

    static {
        Arrays.asList(values()).forEach(e -> MAP.put(e.getValue(), e));
    }

    public static MyEnum valueOf(Integer value) {
        return Optional.ofNullable(MAP.get(value)).orElseThrow(() -> new RuntimeException(String.format("不支持的枚举类型,value:%s", value)));
    }

}
