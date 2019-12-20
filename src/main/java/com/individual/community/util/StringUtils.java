package com.individual.community.util;

import java.nio.charset.StandardCharsets;

public class StringUtils {
    public StringUtils() {
    }

    public static boolean isEmpty(String s) {
        return null == s ? true : s.isEmpty();
    }

    public static byte[] getNativeBytes(String value) {
        return null == value ? new byte[0] : value.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] getNativeBytes(String value, int length) {
        if (length < value.length()) {
            value = value.substring(0, length);
        }

        return initBytesLength(getNativeBytes(value), length);
    }

    public static byte[] initBytesLength(byte[] value, int length) {
        byte[] res = new byte[length];
        System.arraycopy(value, 0, res, 0, value.length);
        return res;
    }

    public static byte[] trimByteArray(byte[] bytes) {
        if (null != bytes && 0 != bytes.length) {
            int length = 0;

            for(int i = bytes.length - 1; i >= 0 && 0 == bytes[i]; --i) {
                ++length;
            }

            byte[] result = new byte[bytes.length - length];
            System.arraycopy(bytes, 0, result, 0, result.length);
            return result;
        } else {
            return null;
        }
    }

    public static String bytesToString(byte[] bytes) {
        return null != bytes && 0 != bytes.length ? new String(bytes) : null;
    }

    public static String getValue(String extraInfo) {
        return isEmpty(extraInfo) ? "" : extraInfo;
    }
}
