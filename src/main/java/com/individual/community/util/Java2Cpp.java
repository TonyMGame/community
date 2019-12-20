package com.individual.community.util;

import com.individual.community.bean.sdk.*;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.*;

public class Java2Cpp {

    public static void main(String[] args) {
        int b = CallCpp.callCpp.IVS_SDK_Init();
        System.out.println(b);
        //登录测试
        String userName = "liangliang";
        String password = "Huawei@123";
        String ip = "182.138.104.100";
        int port = 3722;
        IVS_LOGIN_INFO loginInfo = new IVS_LOGIN_INFO();
        loginInfo.clear();
        loginInfo.cUserName = StringUtils.getNativeBytes(userName);
        loginInfo.pPWD = StringUtils.getNativeBytes(password);
        loginInfo.uiPort = port;
        loginInfo.stIP.uiIPType = 0;
        loginInfo.stIP.cIP = StringUtils.getNativeBytes(ip);
        IntByReference iSessionID = new IntByReference();
        iSessionID.setValue(147);
        System.out.println("iSessionID"+iSessionID.getValue());
        int c = CallCpp.callCpp.IVS_SDK_Login(loginInfo, iSessionID);
        System.out.println(c);
        int m_iSessionID = 147;
        /*if (c == 0) {
             m_iSessionID = iSessionID.getValue();
        }*/
        //上传图片
        SnapshotInfo snapshotInfo = new SnapshotInfo();
        String cameraCode = "12345678900987654321#33ef4fa864fb42d788ca7fdad0c51f36";
        // 摄像机编码
        snapshotInfo.setCameraCode(cameraCode);
        // 抓拍图片类型：默认人脸
        snapshotInfo.setType(IVS_SNAPSHOT_PICTURE_TYPE.IVS_SNAPSHOT_TYPE_FACE);
        // 抓拍图片信息，可以传多张，每张指定抓拍类型，抓拍大图/小图
        List<SnapshotImage> images = new ArrayList<>();
        // 人脸大图
        SnapshotImage image = new SnapshotImage();

        FaceBox faceBox = new FaceBox();
        faceBox.setBottom(20L);
        faceBox.setLeft(10L);
        faceBox.setRight(30L);
        faceBox.setTop(10L);

        image.setFaceBox(faceBox);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmssSSS");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) - 8);
        Date utc = new Date(calendar.getTimeInMillis());
        // 图片抓拍时间YYYYMMDDHHMMSSmmm，24小时制(I图像拍摄时间，IPC时间，抓拍时间必须是UTC时间)
        image.setSnapTime(Long.parseLong(sdf.format(utc)));
        // 抓拍图片类型：大图/小图
        image.setType(ITS_PICTURE_TYPE.ITS_PICTURE_TYPE_FACE_SCENE);
        // 设置经纬度
        image.setLng(113.520782);
        image.setLat(22.276838);
        // 图片内容
        File file = new File("C:\\Users\\CH\\Desktop\\壁纸\\sdk11.jpg");
        if (!file.exists()) {
            System.out.println("图片文件不存在");
        }
        byte[] imageData = new byte[1024];
        try (FileInputStream fs = new FileInputStream(file); FileChannel fileChannel = fs.getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) fileChannel.size());
            while (fileChannel.read(byteBuffer) > 0) {
                // do nothing
            }
            imageData = byteBuffer.array();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(imageData.length);
        // 抓拍图片信息
        image.setData(imageData);
        images.add(image);

        // 设置抓拍图片信息
        snapshotInfo.setImages(images);

        Java2Cpp j2p = new Java2Cpp();
        Result res =  j2p.uploadDeviceImage(snapshotInfo,m_iSessionID);
        System.out.println(res);
    }


   public Result uploadDeviceImage(SnapshotInfo snapshotInfo,int m_iSessionID){

       //this.logger.info("start to upload device image...");
       System.out.println("start to upload device image...“”“");
       if (StringUtils.isEmpty(snapshotInfo.getCameraCode())) {
           //this.logger.error("cameraCode is empty or null!");
           System.out.println("cameraCode is empty or null!");
           return Result.code(2);
       } else if (snapshotInfo.getCameraCode().length() > 64) {
           //this.logger.error("cameraCode length is more than 64!");
           System.out.println("cameraCode length is more than 64!");
           return Result.code(2);
       } else if (snapshotInfo.getImages() != null && !snapshotInfo.getImages().isEmpty()) {
           IVS_FACE_SNAPSHOT_INFO snapshotSouth = new IVS_FACE_SNAPSHOT_INFO();
           snapshotSouth.cCameraCode = StringUtils.getNativeBytes(snapshotInfo.getCameraCode(), 65);
           snapshotSouth.cSnapExtraInfo = StringUtils.getNativeBytes(StringUtils.getValue(snapshotInfo.getExtraInfo()), 1024);
           snapshotSouth.iPicNum = snapshotInfo.getImages().size();
           snapshotSouth.stSnapInfo = new IVS_FACE_SNAPSHOT_IMG_INFO[snapshotSouth.iPicNum];
           int index = 0;
           List<Pointer> pointers = new ArrayList();
           Iterator var5 = snapshotInfo.getImages().iterator();

           while(var5.hasNext()) {
               SnapshotImage image = (SnapshotImage)var5.next();
               if (image.getSnapTime() <= 0L || image.getFaceBox() == null || image.getType() == null || image.getData() == null || image.getData().length == 0) {
                   //this.logger.error("snapshot info's image parameters have been invalid: " + image);
                   System.out.println("snapshot info's image parameters have been invalid: " + image);
                   return Result.code(2);
               }

               IVS_FACE_SNAPSHOT_IMG_INFO stSnapInfo = new IVS_FACE_SNAPSHOT_IMG_INFO();
               stSnapInfo.stFaceInfo = new IVS_FACE_META_INFO();
               stSnapInfo.stFaceInfo.ullSnapTime = image.getSnapTime();
               stSnapInfo.stFaceInfo.eITSType = image.getType().getValue();
               stSnapInfo.stFaceInfo.uiSnapshotGroup = index;
               stSnapInfo.stFaceInfo.stFaceBox = new IVS_RECT();
               stSnapInfo.stFaceInfo.stFaceBox.bottom = image.getFaceBox().getBottom();
               stSnapInfo.stFaceInfo.stFaceBox.left = image.getFaceBox().getLeft();
               stSnapInfo.stFaceInfo.stFaceBox.right = image.getFaceBox().getRight();
               stSnapInfo.stFaceInfo.stFaceBox.top = image.getFaceBox().getTop();
               stSnapInfo.stFaceInfo.dLongitude = image.getLng();
               stSnapInfo.stFaceInfo.dLatitude = image.getLat();
               stSnapInfo.stSnapImg = new IVS_SNAPSHOT_IMG_INFO();
               if (image.getData().length > 1048576) {
                   System.out.println("image length is more than 1M!");
                   //this.logger.error("image length is more than 1M!");
               } else {
                   stSnapInfo.stSnapImg.ulPicLen = image.getData().length;
                   Pointer pointer = new Memory((long)image.getData().length);
                   pointer.write(0L, image.getData(), 0, image.getData().length);
                   stSnapInfo.stSnapImg.pPictureBuf = pointer;
                   pointers.add(pointer);
                   snapshotSouth.stSnapInfo[index++] = stSnapInfo;
               }
           }

           if (snapshotSouth.stSnapInfo != null && snapshotSouth.stSnapInfo.length >= 1) {
               int result = CallCpp.callCpp.IVS_SDK_UploadDeviceImg(m_iSessionID, snapshotInfo.getType().getValue(), snapshotSouth);
               //this.logger.debug("upload device image " + (result == 0 ? "Success" : "Failed(" + result + ")") + "...");
               System.out.println("upload device image " + (result == 0 ? "Success" : "Failed(" + result + ")") + "...");
               Iterator var10 = pointers.iterator();

               while(var10.hasNext()) {
                   Pointer pointer = (Pointer)var10.next();
                   Native.free(Pointer.nativeValue(pointer));
                   Pointer.nativeValue(pointer, 0L);
               }
               return Result.code(result);
           } else {
               //this.logger.error("upload images list is empty!");
               System.out.println("upload images list is empty!");
               return Result.code(2);
           }
       } else {
           //this.logger.error("snapshot images list is empty!");
           System.out.println("snapshot images list is empty!");
           return Result.code(2);
       }






   };


}
