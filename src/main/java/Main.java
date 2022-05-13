import dept.DevTeam;
import dept.MusicTeam;
import dept.OperatorTeam;
import dept.VideoTeam;
import dto.DevDto;
import dto.MusicDto;
import dto.OperatorDto;
import dto.VideoDto;

public class Main {
  static OperatorTeam operatorTeam = new OperatorTeam();
  static DevTeam devTeam = new DevTeam();
  static MusicTeam musicTeam = new MusicTeam();
  static VideoTeam videoTeam = new VideoTeam();

  public static void main(String[] args) {

    System.out.println("여러분 안녕하세요. ... 오늘도 화이팅!");

    VideoDto videoDto = VideoDto.builder()
        .shootVideo("최고의 도전과 실천하리 영상")
        .editVideo("큰은혜 영상")
        .workDay(true)
        .build();

    MusicDto musicDto = MusicDto.builder()
        .composeSong("사랑이야")
        .arrangeSong("주와같이길가는것")
        .recordPlay("사랑이야")
        .recordSing("사랑이야")
        .workDay(true)
        .build();

    DevDto devDto = DevDto.builder()
        .developingPrg("팜보이스")
        .managingPrg("앱이 중간에 꺼지는 문제")
        .workDay(true)
        .build();

    OperatorDto operatorDto = OperatorDto.builder()
        .cost("미듣찬비용")
        .newPeople("김승빈")
        .mealMenu("김치볶음밥")
        .mealTime("점심")
        .workDay(true)
        .payDay(true)
        .build();

    operatorTeam.work(operatorDto);
    devTeam.work(devDto);
    musicTeam.work(musicDto);
    videoTeam.work(videoDto);

    System.out.println("-----------퇴근시간-------------");
  }
}
