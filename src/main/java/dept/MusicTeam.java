package dept;

import dto.DevDto;
import dto.MusicDto;
import employee.externalManpower.Player;
import employee.externalManpower.Vocal;
import employee.music.Composer;

public class MusicTeam implements dept {

  Composer composer = new Composer();
  Player player = new Player();
  Vocal vocal = new Vocal();

  @Override
  public void work(Object obj) {
    MusicDto dto = (MusicDto)obj;
    if (dto.isWorkDay()) {
      System.out.println("---------음악팀이 일합니다.-----------");

      composer.compose(dto.getComposeSong());
      composer.arrangement(dto.getArrangeSong());
      player.record(dto.getRecordPlay());
      vocal.record(dto.getRecordSing());
      return;
    }

    System.out.println("---------음악팀이 쉽니다.-----------");
  }
}
