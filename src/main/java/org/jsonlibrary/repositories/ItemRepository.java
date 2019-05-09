package org.jsonlibrary.repositories;

import org.jsonlibrary.jpademo.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
