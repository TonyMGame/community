package com.individual.community.bean.sdk;

public class FaceBox {
    private long top;
    private long right;
    private long left;
    private long bottom;

    public FaceBox() {
    }

    public long getTop() {
        return this.top;
    }

    public void setTop(long top) {
        this.top = top;
    }

    public long getRight() {
        return this.right;
    }

    public void setRight(long right) {
        this.right = right;
    }

    public long getLeft() {
        return this.left;
    }

    public void setLeft(long left) {
        this.left = left;
    }

    public long getBottom() {
        return this.bottom;
    }

    public void setBottom(long bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "FaceBox{top=" + this.top + ", right=" + this.right + ", left=" + this.left + ", bottom=" + this.bottom + '}';
    }
}
