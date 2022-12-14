package com.tsi.hemsworth.jordan.sakila.connect.language;

import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Integer> {

    Language findByName(String name);
}
