package com.individual.community.bean.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_SNAPSHOT_IMG_INFO extends Structure {

    public int ulPicBufLen;
    public int ulPicLen;
    public long ullPictureID;
    public byte[] cPictureURL = new byte[256];
    public Pointer pPictureBuf;

    public IVS_SNAPSHOT_IMG_INFO() {
        super(1);
    }

    public IVS_SNAPSHOT_IMG_INFO(Pointer p) {
        super(p, 1);
    }


    @Override
    protected List<String> getFieldOrder() {
        List<String> field = new ArrayList();
        field.add("ulPicBufLen");
        field.add("ulPicLen");
        field.add("ullPictureID");
        field.add("cPictureURL");
        field.add("pPictureBuf");
        return field;
    }

    public static class ByValue extends IVS_SNAPSHOT_IMG_INFO implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_SNAPSHOT_IMG_INFO implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }
}
