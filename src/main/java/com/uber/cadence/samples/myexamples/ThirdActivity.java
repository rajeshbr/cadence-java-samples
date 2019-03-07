package com.uber.cadence.samples.myexamples;

import com.uber.cadence.activity.ActivityMethod;

public interface ThirdActivity {
  @ActivityMethod(
    taskList = MultiActivityWorker.THIRD_TASK_LIST,
    scheduleToCloseTimeoutSeconds = 300
  )
  Record processThird(Record record);
}
