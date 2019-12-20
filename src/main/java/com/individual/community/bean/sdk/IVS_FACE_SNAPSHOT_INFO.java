package com.individual.community.bean.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_FACE_SNAPSHOT_INFO extends Structure {
    public byte[] cNVRCode = new byte[33];
    public byte[] cCameraCode = new byte[65];
    public byte[] cSnapExtraInfo = new byte[1024];
    public int iPicNum;
    public IVS_FACE_SNAPSHOT_IMG_INFO[] stSnapInfo;

    public IVS_FACE_SNAPSHOT_INFO() {
        super(1);
}

    public IVS_FACE_SNAPSHOT_INFO(Pointer p) {
        super(p, 1);
    }

    @Override
    protected List<String> getFieldOrder() {
        List<String> field = new ArrayList();
        field.add("cNVRCode");
        field.add("cCameraCode");
        field.add("cSnapExtraInfo");
        field.add("iPicNum");
        field.add("stSnapInfo");
        return field;
    }

    public static class ByValue extends IVS_FACE_SNAPSHOT_INFO implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_FACE_SNAPSHOT_INFO implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }
}
