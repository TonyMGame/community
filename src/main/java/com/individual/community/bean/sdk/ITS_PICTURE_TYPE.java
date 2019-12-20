package com.individual.community.bean.sdk;

public enum ITS_PICTURE_TYPE {
    ITS_PICTURE_TYPE_UNKNOW(-1),
    ITS_PICTURE_TYPE_SCENE(0),
    ITS_PICTURE_TYPE_PLATE(1),
    ITS_PICTURE_TYPE_FEATURE(2),
    ITS_PICTURE_TYPE_FACE_SCENE(3),
    ITS_PICTURE_TYPE_FACE_FEATURE(4);

    private int value;

    private ITS_PICTURE_TYPE(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
