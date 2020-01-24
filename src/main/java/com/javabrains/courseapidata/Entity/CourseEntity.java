package com.javabrains.courseapidata.Entity;

import com.javabrains.Topicapidata.Entity.TopicEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Course")
public class CourseEntity {
    @Id
    private String id;
    private  String name;
    private  String description;
    @ManyToOne(targetEntity = TopicEntity.class)
    private TopicEntity topicEntity;


    public CourseEntity()
    {

    }

    public CourseEntity(String id, String name, String description,String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topicEntity = new TopicEntity(topicId,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TopicEntity getTopicEntity() { return topicEntity; }

    public void setTopicEntity(TopicEntity topicEntity) { this.topicEntity = topicEntity; }
}
