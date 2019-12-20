package com.individual.community.util;

import com.individual.community.bean.sdk.IVS_FACE_SNAPSHOT_INFO;
import com.individual.community.bean.sdk.IVS_LOGIN_INFO;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

public interface CallCpp extends Library {

    String sdk = "C:\\Users\\CH\\Desktop\\esdk64\\bin\\IVS_SDK.dll";
    CallCpp callCpp = (CallCpp)Native.load(sdk,CallCpp.class);

    int IVS_SDK_Init();

    int IVS_SDK_Login(IVS_LOGIN_INFO var1, IntByReference var2);

    int IVS_SDK_UploadDeviceImg(int var1, int var2, IVS_FACE_SNAPSHOT_INFO var3);

    int IVS_SDK_UploadDeviceImgEx(int var1, int var2, IVS_FACE_SNAPSHOT_INFO var3, int var4, int var5, String var6);



}
