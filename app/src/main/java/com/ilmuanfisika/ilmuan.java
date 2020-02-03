package com.ilmuanfisika;

import android.os.Parcel;
import android.os.Parcelable;

public class ilmuan implements Parcelable{
    private String nama;
    private String deskripsi;
    private int photo;

    private String penemuan;
    private String refrensi;

    protected ilmuan(Parcel in) {
        nama = in.readString();
        penemuan = in.readString();
        photo = in.readInt();
        deskripsi = in.readString();
        refrensi = in.readString();

    }

    public static final Parcelable.Creator<ilmuan> CREATOR = new Parcelable.Creator<ilmuan>() {
        @Override
        public ilmuan createFromParcel(Parcel in) {
            return new ilmuan(in);
        }

        @Override
        public ilmuan[] newArray(int size) {
            return new ilmuan[size];
        }
    };

    public ilmuan() {

    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    //==========================================================================
    public String getPenemuan() {
        return penemuan;
    }

    public void setPenemuan(String penemuan) {
        this.penemuan = penemuan;
    }

    public String getRefrensi() {
        return refrensi;
    }

    public void setRefrensi(String refrensi) {
        this.refrensi = refrensi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.penemuan);
        dest.writeInt(this.photo);
        dest.writeString(this.deskripsi);
        dest.writeString(this.refrensi);


    }
}
