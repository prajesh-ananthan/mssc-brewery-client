package io.prajesh.msscbreweryclient.web.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

  private UUID id;
  private String beerName;
  private String beerStyle;
  private Long upc;

}
