package com.challenge.sw_planet_clean_arch.application.usecase;

public interface UseCase<InputDTO, OutputDTO> {
    OutputDTO execute(InputDTO inputDTO);

}
