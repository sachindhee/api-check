package com.api.Repository;

import com.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface userRepository extends MongoRepository<User,String> {

    List<User> findByNameContainingIgnoreCaseAndAge(String name ,int age);
    List<User> findByName(String name);

}
