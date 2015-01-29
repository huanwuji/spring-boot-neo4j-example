package com.huanwuji.neo4j.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.support.index.IndexType;

/**
 * Created by huanwuji on 2015/1/29.
 */
@NodeEntity
public class Movie {

    @GraphId
    private Long id;

    @Indexed(indexType = IndexType.FULLTEXT, indexName = "search")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
