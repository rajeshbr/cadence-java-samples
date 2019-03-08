package com.uber.cadence.samples.myexamples;

import static com.uber.cadence.samples.common.SampleConstants.DOMAIN;

import com.uber.cadence.worker.Worker;

public class MultiActivityWorker {
  static final String FIRST_TASK_LIST = "FirstActivityTask";
  static final String SECOND_TASK_LIST = "SecondFirstActivityTask";
  static final String THIRD_TASK_LIST = "ThirdActivityTask";

  public static void main(String[] args) {

    Worker.Factory factory = new Worker.Factory(args[0], Integer.parseInt(args[1]), DOMAIN);

    final Worker workerForFirstTaskList = factory.newWorker(FIRST_TASK_LIST);
    final Worker workerForSecondTaskList = factory.newWorker(SECOND_TASK_LIST);
    final Worker workerForThirdTaskList = factory.newWorker(THIRD_TASK_LIST);
    workerForFirstTaskList.registerWorkflowImplementationTypes(MultiActivityWorkflowImpl.class);
    workerForSecondTaskList.registerWorkflowImplementationTypes(MultiActivityWorkflowImpl.class);
    workerForThirdTaskList.registerWorkflowImplementationTypes(MultiActivityWorkflowImpl.class);

    workerForFirstTaskList.registerActivitiesImplementations(new FirstActivityImpl());
    workerForSecondTaskList.registerActivitiesImplementations(new SecondActivityImpl());
    workerForThirdTaskList.registerActivitiesImplementations(new ThirdActivityImpl());

    factory.start();
    System.out.println("Worker started for task list: ... ");
  }
}
