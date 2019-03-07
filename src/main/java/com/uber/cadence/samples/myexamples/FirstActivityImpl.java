package com.uber.cadence.samples.myexamples;

import java.time.LocalTime;
import java.time.ZoneId;

public class FirstActivityImpl implements FirstActivity {
  @Override
  public Record processFirst(Record record) {
    System.out.println(
        Thread.currentThread().getId()
            + " In First Activity! "
            + record.getId()
            + " "
            + LocalTime.now(ZoneId.systemDefault()));
    record.setFirstActivity("First Activity completed " + LocalTime.now(ZoneId.systemDefault()));
    return record;
  }
}
