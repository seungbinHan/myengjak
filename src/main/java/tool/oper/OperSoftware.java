package tool.oper;

public class OperSoftware {

  //비용처리
  public void costProcessing(String str) {
    System.out.println(str+"을 지급합니다");
  }

  //월급지급
  public void salaryPayment(boolean payDay){
    if(payDay == true){
      System.out.println("전직원에게 월급을 지급합니다.");
    }else{
      System.out.println("아직 월급날이 아닙니다.");
    }
  };

  //채용
  public void resisterNewManPower(String newEmpl){
    System.out.println(newEmpl+"을 직원 명부에 등록합니다.");
  }

  //확인
  public void checkMenu(){
    System.out.println("오늘의 식사를 요리하기위해 오늘 메뉴를 확인합니다.");
  }

}
