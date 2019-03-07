package com.uber.cadence.samples.myexamples;

import com.uber.cadence.activity.ActivityMethod;

public interface SecondActivity {
  @ActivityMethod(
    taskList = MultiActivityWorker.SECOND_TASK_LIST,
    scheduleToCloseTimeoutSeconds = 300
  )
  Record processSecond(Record record);
}
