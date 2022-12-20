package com.develhope.MongoDb.repository;

import com.develhope.MongoDb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {


}
