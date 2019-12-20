package com.individual.community.bean.sdk;

import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_IP extends Structure {
    public int uiIPType;
    public byte[] cIP = new byte[64];

    public IVS_IP() {
    }

    @Override
    protected List<String> getFieldOrder() {
        List<String> Field = new ArrayList();
        Field.add("uiIPType");
        Field.add("cIP");
        return Field;
    }
}
