package com.uber.cadence.samples.longrunning;

import static com.uber.cadence.samples.common.SampleConstants.DOMAIN;

import com.uber.cadence.client.WorkflowClient;

public class LongRunningQuery {

  public static void main(String[] args) throws Exception {

    if (args.length < 1) {
      System.out.println("Workflow Id is required to run this program");
      System.exit(0);
    }

    WorkflowClient workflowClient = WorkflowClient.newInstance(DOMAIN);
    LongRunningWorkflow workflow =
        workflowClient.newWorkflowStub(LongRunningWorkflow.class, args[0]);

    System.out.println("Current processed count: " + workflow.getProcessedCount());

    System.exit(0);
  }
}
