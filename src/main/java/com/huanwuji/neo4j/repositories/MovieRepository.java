package com.huanwuji.neo4j.repositories;

import com.huanwuji.neo4j.model.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by huanwuji on 2015/1/29.
 */
public interface MovieRepository extends GraphRepository<Movie> {
}
