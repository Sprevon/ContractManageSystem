package com.tinklebi.cms.ht.entity.enums;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 10:15
 */
public enum EditType {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);


    private int value;
    EditType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
