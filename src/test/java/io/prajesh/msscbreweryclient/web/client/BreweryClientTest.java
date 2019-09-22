package io.prajesh.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.prajesh.msscbreweryclient.web.model.BeerDto;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Prajesh Ananthan Created on 21/9/2019.
 */

@SpringBootTest
class BreweryClientTest {

  @Autowired
  private BreweryClient breweryClient;

  @Test
  void getBeerById() {

    // When
    BeerDto beerDto = breweryClient.getBeerById(UUID.randomUUID());

    // Then
    assertNotNull(beerDto);
    System.out.println(beerDto.getBeerName());
  }

  @Test
  void save_new_beer() {

    // When
    URI uri = breweryClient.saveNewBeer(BeerDto.builder().beerName("New Beer").build());

    // Then
    assertNotNull(uri);
    System.out.println(uri.toString());
  }

  @Test
  void update_beer() {

    // When
    breweryClient.updateBeer(BeerDto.builder().beerName("New Beer").build());

  }
}