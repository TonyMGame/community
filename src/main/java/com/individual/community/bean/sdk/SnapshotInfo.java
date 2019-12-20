package com.individual.community.bean.sdk;

import java.util.List;

public class SnapshotInfo {
    private String cameraCode;
    private String extraInfo;
    private IVS_SNAPSHOT_PICTURE_TYPE type;
    private List<SnapshotImage> images;

    public SnapshotInfo() {
    }

    public String getCameraCode() {
        return this.cameraCode;
    }

    public void setCameraCode(String cameraCode) {
        this.cameraCode = cameraCode;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public IVS_SNAPSHOT_PICTURE_TYPE getType() {
        return this.type;
    }

    public void setType(IVS_SNAPSHOT_PICTURE_TYPE type) {
        this.type = type;
    }

    public List<SnapshotImage> getImages() {
        return this.images;
    }

    public void setImages(List<SnapshotImage> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "SnapshotInfo{cameraCode='" + this.cameraCode + '\'' + ", extraInfo='" + this.extraInfo + '\'' + ", type=" + this.type + ", images=" + this.images + '}';
    }
}
