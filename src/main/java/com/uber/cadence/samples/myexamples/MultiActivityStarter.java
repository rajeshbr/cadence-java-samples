package com.uber.cadence.samples.myexamples;

import static com.uber.cadence.samples.common.SampleConstants.DOMAIN;

import com.uber.cadence.client.WorkflowClient;

public class MultiActivityStarter {

  private static WorkflowClient workflowClient = WorkflowClient.newInstance(DOMAIN);

  private static void runWorkflow(Record record, int i) {

    // Record record = new Record();
    MultiActivityWorkflow workflow = workflowClient.newWorkflowStub(MultiActivityWorkflow.class);
    System.out.println("Executing new multi activity workflow");
    record = workflow.processRecord(record, i);
    System.out.println(record.toString());
    // return record;
  }

  public static void main(String[] args) throws Exception {

    for (int i = 0; i < 1; i++) {
      System.out.println("Loop count : " + i);
      Record rec = new Record();
      runWorkflow(rec, i);
    }
    System.exit(0);
  }
}
