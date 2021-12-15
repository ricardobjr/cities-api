package com.github.ricardobjr.citiesapi.countries.repository;

import com.github.ricardobjr.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
