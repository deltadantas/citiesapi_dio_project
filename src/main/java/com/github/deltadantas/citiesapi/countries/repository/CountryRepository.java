package com.github.deltadantas.citiesapi.countries.repository;

import com.github.deltadantas.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
