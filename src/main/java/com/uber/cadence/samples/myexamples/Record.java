package com.uber.cadence.samples.myexamples;

public class Record {
  private int id;
  private String firstActivity;
  private String secondActivity;
  private String thirdActivity;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstActivity() {
    return firstActivity;
  }

  public void setFirstActivity(String firstActivity) {
    this.firstActivity = firstActivity;
  }

  public String getSecondActivity() {
    return secondActivity;
  }

  public void setSecondActivity(String secondActivity) {
    this.secondActivity = secondActivity;
  }

  public String getThirdActivity() {
    return thirdActivity;
  }

  public void setThirdActivity(String thirdActivity) {
    this.thirdActivity = thirdActivity;
  }

  @Override
  public String toString() {
    return "Record{"
        + "id='"
        + id
        + '\''
        + ", firstActivity='"
        + firstActivity
        + '\''
        + ", secondActivity='"
        + secondActivity
        + '\''
        + ", thirdActivity='"
        + thirdActivity
        + '\''
        + '}';
  }
}
