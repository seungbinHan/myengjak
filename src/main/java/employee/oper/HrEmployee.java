package employee.oper;

import tool.oper.OperComputer;

public class HrEmployee {

  OperComputer computer = new OperComputer();

  //  채용
  public void recruitment(String newEmpl){
    System.out.println(newEmpl+"을 채용합니다");
    computer.software.resisterNewManPower(newEmpl);
  }

}
