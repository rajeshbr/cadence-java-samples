package com.uber.cadence.samples.myexamples;

import com.uber.cadence.workflow.Workflow;
import com.uber.cadence.workflow.WorkflowMethod;

public class MultiActivityWorkflowImpl implements MultiActivityWorkflow {

  private FirstActivity firstActivity;
  private SecondActivity secondActivity;
  private ThirdActivity thirdActivity;

  public MultiActivityWorkflowImpl() {
    // Create activity clients.

    this.firstActivity = Workflow.newActivityStub(FirstActivity.class);

    this.secondActivity = Workflow.newActivityStub(SecondActivity.class);

    this.thirdActivity = Workflow.newActivityStub(ThirdActivity.class);
  }

  @WorkflowMethod(executionStartToCloseTimeoutSeconds = 30)
  @Override
  public Record processRecord(Record record, int id) {

    record.setId(id);

    Record record1 = firstActivity.processFirst(record);
    // System.out.println(record1);
    return thirdActivity.processThird(secondActivity.processSecond(record1));
  }
}
