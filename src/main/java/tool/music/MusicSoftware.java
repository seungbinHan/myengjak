package tool.music;

import tool.common.Software;

public class MusicSoftware implements Software {
  public void compose(String song ){
    System.out.println(song + "을 작곡합니다");
  }

  public void arrangement(String song ){
    System.out.println(song + "을 편곡합니다");
  }


}
