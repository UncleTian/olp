package com.bea.olp;

public class S_LOGWithBLOBs extends S_LOG {
    private String message;

    private String throwable;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getThrowable() {
        return throwable;
    }

    public void setThrowable(String throwable) {
        this.throwable = throwable == null ? null : throwable.trim();
    }
}