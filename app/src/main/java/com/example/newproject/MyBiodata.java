package com.example.newproject;

import android.os.Parcel;
import android.os.Parcelable;

public class MyBiodata implements Parcelable {
    private String nama;
    private int umur;

    public MyBiodata(String nama, int umur){
        this.nama = nama;
        this.umur = umur;


    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.umur);
    }

    protected MyBiodata(Parcel in) {
        this.nama = in.readString();
        this.umur = in.readInt();
    }

    public static final Parcelable.Creator<MyBiodata> CREATOR = new Parcelable.Creator<MyBiodata>() {
        @Override
        public MyBiodata createFromParcel(Parcel source) {
            return new MyBiodata(source);
        }

        @Override
        public MyBiodata[] newArray(int size) {
            return new MyBiodata[size];
        }
    };
}
