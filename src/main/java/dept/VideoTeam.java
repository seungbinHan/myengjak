package dept;

import dto.VideoDto;
import employee.video.Editor;
import employee.video.Videographer;

public class VideoTeam implements dept{
  Editor editor = new Editor();
  Videographer videographer = new Videographer();

  @Override
  public void work(Object obj) {
    VideoDto dto = (VideoDto)obj;
    if(dto.isWorkDay()){
      System.out.println("---------제작팀이 일합니다.-----------");

      videographer.shoot(dto.getShootVideo());
      editor.edit(dto.getEditVideo());
      return;
    }

    System.out.println("---------제작팀이 쉽니다.-----------");
  }
}
