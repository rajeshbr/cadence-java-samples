package com.uber.cadence.samples.myexamples;

import java.time.LocalTime;
import java.time.ZoneId;

public class ThirdActivityImpl implements ThirdActivity {
  @Override
  public Record processThird(Record record) {
    System.out.println(
        Thread.currentThread().getId()
            + " In Third Activity! "
            + record.getId()
            + " "
            + LocalTime.now(ZoneId.systemDefault()));
    record.setThirdActivity("Third Activity Complete:  " + LocalTime.now(ZoneId.systemDefault()));
    return record;
  }
}
