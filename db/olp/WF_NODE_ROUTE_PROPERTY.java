package com.bea.olp;

public class WF_NODE_ROUTE_PROPERTY {
    private String routeid;

    private String nodeid;

    private String wfid;

    private String routename;

    private String routecondition;

    private String routeitemlistin;

    private String routeitemcontentin;

    private String classname;

    private String method;

    private String routerunscriptsign;

    private String routerunscript;

    private String noderouternodeid;

    private String appsign;

    private String spstatus;

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid == null ? null : wfid.trim();
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    public String getRoutecondition() {
        return routecondition;
    }

    public void setRoutecondition(String routecondition) {
        this.routecondition = routecondition == null ? null : routecondition.trim();
    }

    public String getRouteitemlistin() {
        return routeitemlistin;
    }

    public void setRouteitemlistin(String routeitemlistin) {
        this.routeitemlistin = routeitemlistin == null ? null : routeitemlistin.trim();
    }

    public String getRouteitemcontentin() {
        return routeitemcontentin;
    }

    public void setRouteitemcontentin(String routeitemcontentin) {
        this.routeitemcontentin = routeitemcontentin == null ? null : routeitemcontentin.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getRouterunscriptsign() {
        return routerunscriptsign;
    }

    public void setRouterunscriptsign(String routerunscriptsign) {
        this.routerunscriptsign = routerunscriptsign == null ? null : routerunscriptsign.trim();
    }

    public String getRouterunscript() {
        return routerunscript;
    }

    public void setRouterunscript(String routerunscript) {
        this.routerunscript = routerunscript == null ? null : routerunscript.trim();
    }

    public String getNoderouternodeid() {
        return noderouternodeid;
    }

    public void setNoderouternodeid(String noderouternodeid) {
        this.noderouternodeid = noderouternodeid == null ? null : noderouternodeid.trim();
    }

    public String getAppsign() {
        return appsign;
    }

    public void setAppsign(String appsign) {
        this.appsign = appsign == null ? null : appsign.trim();
    }

    public String getSpstatus() {
        return spstatus;
    }

    public void setSpstatus(String spstatus) {
        this.spstatus = spstatus == null ? null : spstatus.trim();
    }
}