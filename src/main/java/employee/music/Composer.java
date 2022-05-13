package employee.music;

import tool.music.MusicComputer;

public class Composer {
  MusicComputer computer = new MusicComputer();

  public void compose(String song) {
    System.out.println(song+"를 새로 작곡합니다");
  }

  public void arrangement(String song) {
    System.out.println(song+"를 새로 편곡합니다");
  }
}
