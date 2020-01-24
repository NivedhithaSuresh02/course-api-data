package com.javabrains.Topicapidata.Service;

import com.javabrains.Topicapidata.Entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<TopicEntity,String> {
    //Through the crud repo u get all this methods
    //getAllTopic()
    //getTopic(String id)
    //updateTopic(topicEntity T)
    //deleteTopic(String id)
}
