package com.finger.appinfo.pojo;

import java.util.Date;

public class AppInfo {
    private Long id;

    private String appName;

    private String osName;

    private String config;

    private String versions;

    private String appPath;

    private String qrcodePath;

    private Date appTime;

    public AppInfo(Long id, String appName, String osName, String config, String versions, String appPath, String qrcodePath, Date appTime) {
        this.id = id;
        this.appName = appName;
        this.osName = osName;
        this.config = config;
        this.versions = versions;
        this.appPath = appPath;
        this.qrcodePath = qrcodePath;
        this.appTime = appTime;
    }

    public AppInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions == null ? null : versions.trim();
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath == null ? null : appPath.trim();
    }

    public String getQrcodePath() {
        return qrcodePath;
    }

    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath == null ? null : qrcodePath.trim();
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }
}