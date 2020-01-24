package com.javabrains.Topicapidata.Controller;

import com.javabrains.Topicapidata.Entity.TopicEntity;
import com.javabrains.Topicapidata.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class TopicController {

    @Autowired
    private TopicService topicService;

    /* @RequestMapping("/topics")
     public List<TopicEntity> getAllTopics()
     {
         return Arrays.asList(
                 new TopicEntity(1,"spring","spring course"),
                 new TopicEntity(2,"java","java course"),
                 new TopicEntity(3,"react","react course")
         );
     }*/
    @RequestMapping("/topics")
    public List<TopicEntity> getAllTopics()
    {
        return topicService.getAllTopics();
    }
    //to get a single record based on id
    @RequestMapping("/topics/{id}")
    public TopicEntity getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }
    //to create a new record in the list
    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody TopicEntity topicEntity)
    {
        topicService.addTopic(topicEntity);
    }
    //to update a value in the list
    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody TopicEntity topicEntity , @PathVariable String id)
    {
        topicService.updateTopic(topicEntity,id);
    }
    //to delete a value from the list
    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}
