package com.bea.olp;

public class BIZ_CII_INFOWithBLOBs extends BIZ_CII_INFO {
    private String pbcphoto;

    private String photo;

    public String getPbcphoto() {
        return pbcphoto;
    }

    public void setPbcphoto(String pbcphoto) {
        this.pbcphoto = pbcphoto == null ? null : pbcphoto.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}