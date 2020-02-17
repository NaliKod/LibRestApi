package com.crud.library.repository;

import com.crud.library.domain.CopyOfBook;
import com.crud.library.domain.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CopyOfBooksRepository extends CrudRepository<CopyOfBook, Long> {

    @Override
    CopyOfBook save(CopyOfBook copyOfBook);

    //@Override
    List<CopyOfBook> findBy (Title title);


}
