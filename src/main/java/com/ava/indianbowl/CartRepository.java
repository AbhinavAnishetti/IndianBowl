package com.ava.indianbowl;

import com.ava.indianbowl.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<ItemEntity, Long> {
}
