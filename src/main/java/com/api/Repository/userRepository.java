package com.api.Repository;

import com.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User,String> {
}
