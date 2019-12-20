package com.individual.community.bean.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_FACE_META_INFO extends Structure {
    public long ullSnapTime;
    public IVS_RECT stFaceBox;
    public int eITSType;
    public int uiSnapshotGroup;
    public double dLongitude;
    public double dLatitude;
    public byte[] cReserved = new byte[204];

    public IVS_FACE_META_INFO() {
        super(1);
    }

    public IVS_FACE_META_INFO(Pointer p) {
        super(p, 1);
    }


    @Override
    protected List<String> getFieldOrder() {
        List<String> field = new ArrayList();
        field.add("ullSnapTime");
        field.add("stFaceBox");
        field.add("eITSType");
        field.add("uiSnapshotGroup");
        field.add("dLongitude");
        field.add("dLatitude");
        field.add("cReserved");
        return field;
    }

    public static class ByValue extends IVS_FACE_META_INFO implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_FACE_META_INFO implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }
}
