package com.bea.olp;

public class S_ROLE extends S_ROLEKey {
    private String roleName;

    private String roleSts;

    private String roleRmk;

    private String lastChgDt;

    private String lastChgUsr;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSts() {
        return roleSts;
    }

    public void setRoleSts(String roleSts) {
        this.roleSts = roleSts == null ? null : roleSts.trim();
    }

    public String getRoleRmk() {
        return roleRmk;
    }

    public void setRoleRmk(String roleRmk) {
        this.roleRmk = roleRmk == null ? null : roleRmk.trim();
    }

    public String getLastChgDt() {
        return lastChgDt;
    }

    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt == null ? null : lastChgDt.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }
}