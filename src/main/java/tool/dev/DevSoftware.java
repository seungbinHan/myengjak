package tool.dev;

import tool.common.Software;

public class DevSoftware implements Software {

  public void dev(String req){
    System.out.println(req+"를 새로 개발합니다");
  }

  public void manage(String problem){
    System.out.println("기존 프로그램의"+problem+"문제를 고칩니다.");
  }

}
