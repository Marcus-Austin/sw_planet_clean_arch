package com.challenge.sw_planet_clean_arch.application.usecase.planet;

import com.challenge.sw_planet_clean_arch.application.gateway.PlanetGateway;
import com.challenge.sw_planet_clean_arch.application.usecase.UseCase;
import com.challenge.sw_planet_clean_arch.domain.entity.Planet;

public class DeletePlanetUseCase implements UseCase<Planet,Planet>{

    private final PlanetGateway planetGateway;

    public DeletePlanetUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(Planet planet){
        if(planet == null ){
            throw new IllegalArgumentException("Invalid planet data");
        }
         this.planetGateway.delete(planet);
         return planet;
    }
}
