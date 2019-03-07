package com.uber.cadence.samples.longrunning;

import static com.uber.cadence.samples.common.SampleConstants.DOMAIN;

import com.uber.cadence.client.WorkflowClient;

public class LongRunningSignal {
  private static WorkflowClient workflowClient = WorkflowClient.newInstance(DOMAIN);

  public static void main(String[] args) throws Exception {

    if (args.length < 1) {
      System.out.println("Workflow Id is required to run this program");
      System.exit(0);
    }

    LongRunningWorkflow workflow =
        workflowClient.newWorkflowStub(LongRunningWorkflow.class, args[0]);

    workflow.incrementProcessedCount();

    System.exit(0);
  }
}
