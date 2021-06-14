package com.example.a2recyclerreceitas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Result implements Parcelable {
  private String aliases;
  private String api_detail_url;
  private Object birth;
  private int count_of_issue_appearances;
  private String date_added;
  private String date_last_updated;
  private String deck;
  private String description;
  private FirstAppearedInIssue first_appeared_in_issue;
  private int gender;
  private int id;
  private Image image;
  private String name;
  private Origin origin;
  private Publisher publisher;
  private String real_name;
  private String site_detail_url;

  protected Result(Parcel in) {
    aliases = in.readString();
    api_detail_url = in.readString();
    count_of_issue_appearances = in.readInt();
    date_added = in.readString();
    date_last_updated = in.readString();
    deck = in.readString();
    description = in.readString();
    gender = in.readInt();
    id = in.readInt();
    name = in.readString();
    real_name = in.readString();
    site_detail_url = in.readString();
  }

  public static final Creator<Result> CREATOR = new Creator<Result>() {
    @Override
    public Result createFromParcel(Parcel in) {
      return new Result(in);
    }

    @Override
    public Result[] newArray(int size) {
      return new Result[size];
    }
  };

  public String getAliases() {
    return aliases;
  }

  public void setAliases(String aliases) {
    this.aliases = aliases;
  }

  public String getApi_detail_url() {
    return api_detail_url;
  }

  public void setApi_detail_url(String api_detail_url) {
    this.api_detail_url = api_detail_url;
  }

  public Object getBirth() {
    return birth;
  }

  public void setBirth(Object birth) {
    this.birth = birth;
  }

  public int getCount_of_issue_appearances() {
    return count_of_issue_appearances;
  }

  public void setCount_of_issue_appearances(int count_of_issue_appearances) {
    this.count_of_issue_appearances = count_of_issue_appearances;
  }

  public String getDate_added() {
    return date_added;
  }

  public void setDate_added(String date_added) {
    this.date_added = date_added;
  }

  public String getDate_last_updated() {
    return date_last_updated;
  }

  public void setDate_last_updated(String date_last_updated) {
    this.date_last_updated = date_last_updated;
  }

  public String getDeck() {
    return deck;
  }

  public void setDeck(String deck) {
    this.deck = deck;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FirstAppearedInIssue getFirst_appeared_in_issue() {
    return first_appeared_in_issue;
  }

  public void setFirst_appeared_in_issue(FirstAppearedInIssue first_appeared_in_issue) {
    this.first_appeared_in_issue = first_appeared_in_issue;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public String getReal_name() {
    return real_name;
  }

  public void setReal_name(String real_name) {
    this.real_name = real_name;
  }

  public String getSite_detail_url() {
    return site_detail_url;
  }

  public void setSite_detail_url(String site_detail_url) {
    this.site_detail_url = site_detail_url;
  }

  @Override
  public String toString() {
    return "Result{" +
        "aliases='" + aliases + '\'' +
        ", api_detail_url='" + api_detail_url + '\'' +
        ", birth=" + birth +
        ", count_of_issue_appearances=" + count_of_issue_appearances +
        ", date_added='" + date_added + '\'' +
        ", date_last_updated='" + date_last_updated + '\'' +
        ", deck='" + deck + '\'' +
        ", description='" + description + '\'' +
        ", first_appeared_in_issue=" + first_appeared_in_issue +
        ", gender=" + gender +
        ", id=" + id +
        ", image=" + image +
        ", name='" + name + '\'' +
        ", origin=" + origin +
        ", publisher=" + publisher +
        ", real_name='" + real_name + '\'' +
        ", site_detail_url='" + site_detail_url + '\'' +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(aliases);
    dest.writeString(api_detail_url);
    dest.writeInt(count_of_issue_appearances);
    dest.writeString(date_added);
    dest.writeString(date_last_updated);
    dest.writeString(deck);
    dest.writeString(description);
    dest.writeInt(gender);
    dest.writeInt(id);
    dest.writeString(name);
    dest.writeString(real_name);
    dest.writeString(site_detail_url);
  }
}


