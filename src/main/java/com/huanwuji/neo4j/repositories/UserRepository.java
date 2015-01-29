package com.huanwuji.neo4j.repositories;

import com.huanwuji.neo4j.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;


public interface UserRepository extends GraphRepository<User> {

    User findByUserId(String userId);

    Iterable<User> findByUserNameLike(String userName);
}
