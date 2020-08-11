package com.xq.pgyer

class PgyerExtension {
    String _api_key = "d72e59e0f86516ff413c31ed857754ca"
    String uKey = "3fca2287bdb6bf3b6c45667ae942b4bb"
    /**
     * 安装方式： 2：密码安装，3：邀请安装
     */
    int buildInstallType = 2
    /**
     * 密码安装所需密码
     */
    String buildPassword = "123"
    /**
     * 上传日志
     */
    String buildUpdateDescription = "默认"
    /**
     * 上传地址
     */
    String uploadPath = "https://www.pgyer.com/apiv2/app/upload"

    /**
     * apk文件路径
     */
    String apkPath = "app\\build\\outputs\\apk\\release"


    @Override
    public String toString() {
        return "PgyerExtension{" +
                "_api_key='" + _api_key + '\'' +
                ", uKey='" + uKey + '\'' +
                ", buildInstallType=" + buildInstallType +
                ", buildPassword='" + buildPassword + '\'' +
                ", buildUpdateDescription='" + buildUpdateDescription + '\'' +
                ", uploadPath='" + uploadPath + '\'' +
                ", apkPath='" + apkPath + '\'' +
                '}';
    }
}