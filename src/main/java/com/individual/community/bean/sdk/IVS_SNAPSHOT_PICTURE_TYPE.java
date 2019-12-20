package com.individual.community.bean.sdk;

public enum IVS_SNAPSHOT_PICTURE_TYPE {
    IVS_SNAPSHOT_TYPE_UNKNOW(-1),
    IVS_SNAPSHOT_TYPE_RESERVE(0),
    IVS_SNAPSHOT_TYPE_FACE(1);

    private int value;

    private IVS_SNAPSHOT_PICTURE_TYPE(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
