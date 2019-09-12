package com.itv.demo.repository;

import com.itv.demo.entity.PageValue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PageValueRepository extends MongoRepository<PageValue, String> {
}
