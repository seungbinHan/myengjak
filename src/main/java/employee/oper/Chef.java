package employee.oper;

import tool.oper.CookTools;
import tool.oper.OperComputer;

public class Chef {

  OperComputer computer = new OperComputer();
  CookTools cookTools = new CookTools();

  //  식사준비
  public void meal(String time, String menu){
    computer.software.checkMenu();
    System.out.println(time+"식사를 준비합니다.");
    cookTools.cook(menu);

  };
}
