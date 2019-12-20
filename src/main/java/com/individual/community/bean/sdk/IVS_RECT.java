package com.individual.community.bean.sdk;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_RECT extends Structure {
    public long left;
    public long top;
    public long right;
    public long bottom;

    public IVS_RECT() {
        super(1);
    }

    public IVS_RECT(Pointer p) {
        super(p, 1);
    }

    protected List<String> getFieldOrder() {
        List<String> field = new ArrayList();
        field.add("left");
        field.add("top");
        field.add("right");
        field.add("bottom");
        return field;
    }

    public static class ByValue extends IVS_RECT implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_RECT implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }
}
