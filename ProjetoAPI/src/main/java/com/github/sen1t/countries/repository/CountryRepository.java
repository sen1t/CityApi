package com.github.sen1t.countries.repository;

import com.github.sen1t.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
