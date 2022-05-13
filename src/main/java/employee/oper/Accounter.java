package employee.oper;

import tool.oper.OperComputer;

public class Accounter {

  OperComputer computer = new OperComputer();

  //비용처리
  public void costProcessing(String str) {
    computer.software.costProcessing(str);
  }

  //월급지급
  public void salaryPayment(boolean payDay){
    computer.software.salaryPayment(payDay);
  };

}
