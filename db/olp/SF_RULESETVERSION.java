package com.bea.olp;

public class SF_RULESETVERSION {
    private String name;

    private String version;

    private String versiondesc;

    private String pubinfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getVersiondesc() {
        return versiondesc;
    }

    public void setVersiondesc(String versiondesc) {
        this.versiondesc = versiondesc == null ? null : versiondesc.trim();
    }

    public String getPubinfo() {
        return pubinfo;
    }

    public void setPubinfo(String pubinfo) {
        this.pubinfo = pubinfo == null ? null : pubinfo.trim();
    }
}