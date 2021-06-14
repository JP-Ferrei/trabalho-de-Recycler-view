package com.example.a2recyclerreceitas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FirstAppearedInIssue implements Parcelable {
  public String api_detail_url;
  public int id;
  public String name;
  public String issue_number;

  protected FirstAppearedInIssue(Parcel in) {
    api_detail_url = in.readString();
    id = in.readInt();
    name = in.readString();
    issue_number = in.readString();
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(api_detail_url);
    dest.writeInt(id);
    dest.writeString(name);
    dest.writeString(issue_number);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Creator<FirstAppearedInIssue> CREATOR = new Creator<FirstAppearedInIssue>() {
    @Override
    public FirstAppearedInIssue createFromParcel(Parcel in) {
      return new FirstAppearedInIssue(in);
    }

    @Override
    public FirstAppearedInIssue[] newArray(int size) {
      return new FirstAppearedInIssue[size];
    }
  };

  public String getApi_detail_url() {
    return api_detail_url;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getIssue_number() {
    return issue_number;
  }

  @Override
  public String toString() {
    return "FirstAppearedInIssue{" +
        "api_detail_url='" + api_detail_url + '\'' +
        ", id=" + id +
        ", name='" + name + '\'' +
        ", issue_number='" + issue_number + '\'' +
        '}';
  }
}
