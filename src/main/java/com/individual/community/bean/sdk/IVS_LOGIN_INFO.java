package com.individual.community.bean.sdk;

import com.sun.jna.Structure;

import java.util.ArrayList;
import java.util.List;

public class IVS_LOGIN_INFO extends Structure {

    public byte[] cUserName = new byte[128];
    public byte[] pPWD = new byte[64];
    public IVS_IP stIP;
    public int uiPort;
    public int uiLoginType;
    public byte[] cDomainName = new byte[64];
    public byte[] cMachineName = new byte[128];
    public int uiClientType;
    public byte[] cReserve = new byte[32];

    public IVS_LOGIN_INFO() {
    }


    @Override
    protected List<String> getFieldOrder() {
        List<String> Field = new ArrayList();
        Field.add("cUserName");
        Field.add("pPWD");
        Field.add("stIP");
        Field.add("uiPort");
        Field.add("uiLoginType");
        Field.add("cDomainName");
        Field.add("cMachineName");
        Field.add("uiClientType");
        Field.add("cReserve");
        return Field;
    }

    public static class ByValue extends IVS_LOGIN_INFO implements com.sun.jna.Structure.ByValue {
        public ByValue() {
        }
    }

    public static class ByReference extends IVS_LOGIN_INFO implements com.sun.jna.Structure.ByReference {
        public ByReference() {
        }
    }
}
