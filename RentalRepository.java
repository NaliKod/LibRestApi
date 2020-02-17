package com.crud.library.repository;

import com.crud.library.domain.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Long>{

    @Override
    Rental save (Rental rental);
}
