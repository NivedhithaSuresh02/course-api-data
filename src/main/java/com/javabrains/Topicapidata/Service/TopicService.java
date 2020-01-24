package com.javabrains.Topicapidata.Service;

import com.javabrains.Topicapidata.Entity.TopicEntity;
import com.javabrains.Topicapidata.Service.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
   /*private List<TopicEntity> topics = new ArrayList<>(Arrays.asList(
            new TopicEntity("s1", "spring", "spring course"),
            new TopicEntity("j1", "java", "java course"),
            new TopicEntity("r1", "react", "react course")
    ));
*/



    public List<TopicEntity> getAllTopics() {
        //return topics;
        List <TopicEntity> topics =  new ArrayList<>();
        //for each element found in the database by findAll method is put into the above list through iteration
        //:: method references
        topicRepository.findAll().forEach(topics::add);
           return topics;

    }

    public TopicEntity getTopic(String id) {
       // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(TopicEntity topicEntity) {
        //topics.add(topicEntity);
        topicRepository.save(topicEntity);
    }

    public void updateTopic(TopicEntity topicEntity, String id) {
      /*  for (int i = 0; i < topics.size(); i++) {
            TopicEntity t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topicEntity);
                return;
    }
    }
     */
      topicRepository.save(topicEntity);


    }

    public void deleteTopic(String id) {
       // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

}

