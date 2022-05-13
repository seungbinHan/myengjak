package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
  private boolean workDay;
  private String composeSong ;
  private String arrangeSong;
  private String recordPlay;
  private String recordSing;
}
