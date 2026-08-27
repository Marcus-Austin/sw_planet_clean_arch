package com.challenge.sw_planet_clean_arch.domain.entity;

import java.io.Serial;
import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Planet implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String climate;

    private String terrain;

    private String filmApperances;

}
