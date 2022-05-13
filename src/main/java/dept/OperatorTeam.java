package dept;

import dto.OperatorDto;
import employee.oper.Accounter;
import employee.oper.Chef;
import employee.oper.HrEmployee;

public class OperatorTeam implements dept{

  Accounter accounter = new Accounter();
  HrEmployee hrEmployee = new HrEmployee();
  Chef chef = new Chef();
  @Override
  public void work(Object obj) {
    OperatorDto dto = (OperatorDto)obj;
    if(dto.isWorkDay()){
      System.out.println("--------운영팀이 일합니다.-------");
      accounter.costProcessing(dto.getCost());
      accounter.salaryPayment(dto.isPayDay());
      hrEmployee.recruitment(dto.getNewPeople());
      chef.meal(dto.getMealTime(),dto.getMealMenu());
      return;
    }

    System.out.println("--------운영팀이 쉽니다.-------");

  }

}