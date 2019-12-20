package com.individual.community.bean.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_FACE_SNAPSHOT_IMG_INFO extends Structure {

    public IVS_FACE_META_INFO stFaceInfo;
    public IVS_SNAPSHOT_IMG_INFO stSnapImg;

    public IVS_FACE_SNAPSHOT_IMG_INFO() {
        super(1);
    }

    public IVS_FACE_SNAPSHOT_IMG_INFO(Pointer p) {
        super(p, 1);
    }


    @Override
    protected List<String> getFieldOrder() {
        List<String> field = new ArrayList();
        field.add("stFaceInfo");
        field.add("stSnapImg");
        return field;
    }

    public static class ByValue extends IVS_FACE_SNAPSHOT_IMG_INFO implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_FACE_SNAPSHOT_IMG_INFO implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }

}
