package com.challenge.sw_planet_clean_arch.application.usecase.planet;

import com.challenge.sw_planet_clean_arch.application.gateway.PlanetGateway;
import com.challenge.sw_planet_clean_arch.application.usecase.UseCase;
import com.challenge.sw_planet_clean_arch.domain.entity.Planet;

public class CreatePlanetUseCase implements UseCase<Planet, Planet>{

 private final PlanetGateway planetGateway;

 public CreatePlanetUseCase(PlanetGateway planetGateway) {
  this.planetGateway = planetGateway;
 }

 @Override
 public Planet execute(Planet planet){
    if(
        planet == null ||
        planet.getName().isEmpty() ||
        planet.getClimate().isEmpty() ||
        planet.getTerrain().isEmpty()
    ){
        throw new IllegalArgumentException("Invalid planet data");
    }
    return this.planetGateway.save(planet);
 }
}
