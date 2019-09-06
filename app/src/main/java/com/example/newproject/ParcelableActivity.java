package com.example.newproject;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class ParcelableActivity implements Parcelable {

    private String title;
    private String content;
    private String id;
    private String date;
    private String author;
    private String url;
    int readCount;
    boolean isDraft;
    List<String> tagits;
    List<String> commentlist;

    public ParcelableActivity() {
    }

    protected ParcelableActivity(Parcel in) {
        title = in.readString();
        content = in.readString();
        id = in.readString();
        date = in.readString();
        author = in.readString();
        url = in.readString();
        readCount = in.readInt();
        isDraft = in.readByte() != 0;
        tagits = in.createStringArrayList();
        commentlist = in.createStringArrayList();
    }

    public static final Creator<ParcelableActivity> CREATOR = new Creator<ParcelableActivity>() {
        @Override
        public ParcelableActivity createFromParcel(Parcel in) {
            return new ParcelableActivity(in);
        }

        @Override
        public ParcelableActivity[] newArray(int size) {
            return new ParcelableActivity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(content);
        parcel.writeString(id);
        parcel.writeString(date);
        parcel.writeString(author);
        parcel.writeString(url);
        parcel.writeInt(readCount);
        parcel.writeByte((byte) (isDraft ? 1 : 0));
        parcel.writeStringList(tagits);
        parcel.writeStringList(commentlist);
    }

    public static class Comment implements Parcelable{
        private String comment;
        private String user;
        private String date;

        public Comment() {
        }

        protected Comment(Parcel in) {
            comment = in.readString();
            user = in.readString();
            date = in.readString();
        }

        public static final Creator<Comment> CREATOR = new Creator<Comment>() {
            @Override
            public Comment createFromParcel(Parcel in) {
                return new Comment(in);
            }

            @Override
            public Comment[] newArray(int size) {
                return new Comment[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {

            parcel.writeString(comment);
            parcel.writeString(user);
            parcel.writeString(date);
        }
    }
}
