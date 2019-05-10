package org.jsonlibrary.jpademo.repositories;

import org.jsonlibrary.jpademo.entities.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemRepository extends CrudRepository<Item, Integer> {

}
