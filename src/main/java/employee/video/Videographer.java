package employee.video;

import tool.video.Camcoder;

public class Videographer {
  Camcoder camcoder = new Camcoder();

  public void shoot(String video) {
    camcoder.shoot(video);
  }
}
