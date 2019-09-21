package io.prajesh.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.prajesh.msscbreweryclient.web.model.BeerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Prajesh Ananthan Created on 21/9/2019.
 */

@Slf4j
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
    log.info(beerDto.getBeerName());
  }
}