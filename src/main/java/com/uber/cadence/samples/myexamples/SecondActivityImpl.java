package com.uber.cadence.samples.myexamples;

import java.time.LocalTime;
import java.time.ZoneId;

public class SecondActivityImpl implements SecondActivity {

  @Override
  public Record processSecond(Record record) {
    System.out.println(
        Thread.currentThread().getId()
            + " In Second Activity! "
            + record.getId()
            + " "
            + LocalTime.now(ZoneId.systemDefault()));
    record.setSecondActivity(
        "Second activity completed:  " + LocalTime.now(ZoneId.systemDefault()));
    return record;
  }
}
