package com.uber.cadence.samples.myexamples;

import com.uber.cadence.activity.ActivityMethod;

public interface FirstActivity {
  @ActivityMethod(
    taskList = MultiActivityWorker.FIRST_TASK_LIST,
    scheduleToCloseTimeoutSeconds = 300
  )
  Record processFirst(Record record);
}
