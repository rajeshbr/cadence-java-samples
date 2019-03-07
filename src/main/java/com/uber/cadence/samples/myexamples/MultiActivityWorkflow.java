package com.uber.cadence.samples.myexamples;

import com.uber.cadence.workflow.WorkflowMethod;

public interface MultiActivityWorkflow {

  @WorkflowMethod(
    taskList = MultiActivityWorker.FIRST_TASK_LIST,
    executionStartToCloseTimeoutSeconds = 900
  )
  Record processRecord(Record record, int id);
}
