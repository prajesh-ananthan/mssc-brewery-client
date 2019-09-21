package io.prajesh.msscbreweryclient.web.client;

import io.prajesh.msscbreweryclient.web.model.BeerDto;
import java.util.UUID;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Prajesh Ananthan Created on 21/9/2019.
 */
@Component
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
public class BreweryClient {

  private final String BEER_PATH_V1 = "/api/v1/beer/";

  private String apihost;

  private RestTemplate restTemplate;

  public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  public BeerDto getBeerById(UUID uuid) {
    String url = apihost + BEER_PATH_V1 + UUID.randomUUID().toString();
    return restTemplate.getForObject(url, BeerDto.class);
  }

  public void setApihost(String apihost) {
    this.apihost = apihost;
  }
}
