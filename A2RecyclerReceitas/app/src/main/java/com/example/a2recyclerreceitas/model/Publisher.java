package com.example.a2recyclerreceitas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Publisher implements Parcelable {
  public String api_detail_url;
  public int id;
  public String name;

  protected Publisher(Parcel in) {
    api_detail_url = in.readString();
    id = in.readInt();
    name = in.readString();
  }

  public static final Creator<Publisher> CREATOR = new Creator<Publisher>() {
    @Override
    public Publisher createFromParcel(Parcel in) {
      return new Publisher(in);
    }

    @Override
    public Publisher[] newArray(int size) {
      return new Publisher[size];
    }
  };

  public String getApi_detail_url() {
    return api_detail_url;
  }

  public void setApi_detail_url(String api_detail_url) {
    this.api_detail_url = api_detail_url;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(api_detail_url);
    dest.writeInt(id);
    dest.writeString(name);
  }
}
