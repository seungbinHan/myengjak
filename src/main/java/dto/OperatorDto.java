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
public class OperatorDto {

  private boolean workDay;
  private String cost ;
  private boolean payDay ;
  private String newPeople ;
  private String mealTime ;
  private String mealMenu ;

}
