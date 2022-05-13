package dept;

import dto.DevDto;
import dto.OperatorDto;
import employee.dev.Developer;

public class DevTeam implements dept {

  Developer developer = new Developer();

  @Override
  public void work(Object obj) {
    DevDto dto = (DevDto)obj;
    if (dto.isWorkDay()) {
      System.out.println("---------개발팀이 일합니다.-----------");

      developer.dev(dto.getDevelopingPrg());
      developer.manage(dto.getManagingPrg());
      return;
    }
    System.out.println("---------개발팀이 쉽니다.-----------");
  }
}

