package com.wjz.stream.vo;

import lombok.Data;

@Data
public class TestVO {
    private String field1;
    private String field2;

    @Override
    public String toString() {
        return "field1:" + field1 + "," + "field2:" + field2;
    }
}
