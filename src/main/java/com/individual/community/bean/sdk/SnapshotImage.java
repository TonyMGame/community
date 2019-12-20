package com.individual.community.bean.sdk;

import java.util.Arrays;

public class SnapshotImage {
    private ITS_PICTURE_TYPE type;
    private byte[] data;
    private long snapTime;
    private FaceBox faceBox;
    private double lng;
    private double lat;

    public SnapshotImage() {
    }

    public ITS_PICTURE_TYPE getType() {
        return this.type;
    }

    public void setType(ITS_PICTURE_TYPE type) {
        this.type = type;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public long getSnapTime() {
        return this.snapTime;
    }

    public void setSnapTime(long snapTime) {
        this.snapTime = snapTime;
    }

    public FaceBox getFaceBox() {
        return this.faceBox;
    }

    public void setFaceBox(FaceBox faceBox) {
        this.faceBox = faceBox;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String toString() {
        return "SnapshotImage{type=" + this.type + ", data=" + Arrays.toString(this.data) + ", snapTime=" + this.snapTime + ", faceBox=" + this.faceBox + ", lng=" + this.lng + ", lat=" + this.lat + '}';
    }
}
