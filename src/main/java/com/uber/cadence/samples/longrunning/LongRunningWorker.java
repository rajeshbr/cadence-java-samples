package com.uber.cadence.samples.longrunning;

import static com.uber.cadence.samples.common.SampleConstants.DOMAIN;

import com.uber.cadence.worker.Worker;

public class LongRunningWorker {
  static final String LONGRUNNINGTASK = "long-running-task";

  public static void main(String[] args) {

    Worker.Factory factory = new Worker.Factory(DOMAIN);
    final Worker workerForFirstTaskList = factory.newWorker(LONGRUNNINGTASK);

    workerForFirstTaskList.registerWorkflowImplementationTypes(LongRunningWorkflowImpl.class);

    // workerForFirstTaskList.registerActivitiesImplementations(new FirstActivityImpl());

    factory.start();
    System.out.println("Worker started for task list: ... ");
  }
}
