package employee.dev;

import tool.dev.DevComputer;

public class Developer {

  DevComputer devComputer = new DevComputer();

  public void dev(String req) {
    devComputer.software.dev(req);
  }

  public void manage(String problem) {
    devComputer.software.manage(problem);
  }


}
