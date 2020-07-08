package EpamLearn;

import EpamLearn.ClassesModule.CalculationsMainTaskClassesModule;
import EpamLearn.FundamentalsModule.MainTaskFundamentalsModule;
import EpamLearn.FundamentalsModule.OptionalTask1FundamentalsModule;


public class Runner {

  public static void main(String[] args) {

    MainTaskFundamentalsModule mainTaskFundamentalsModule = new MainTaskFundamentalsModule();
    mainTaskFundamentalsModule.runAllTasks(args);

    OptionalTask1FundamentalsModule optionalTask1FundamentalsModule = new OptionalTask1FundamentalsModule();
    optionalTask1FundamentalsModule.runAllTasks();

    CalculationsMainTaskClassesModule calculationsMainTaskClassesModule = new CalculationsMainTaskClassesModule();
    calculationsMainTaskClassesModule.runAllTasks();


  }

}
