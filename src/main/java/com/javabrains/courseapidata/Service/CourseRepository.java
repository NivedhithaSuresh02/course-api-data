package com.javabrains.courseapidata.Service;

import com.javabrains.courseapidata.Entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseEntity,String> {
    //to get all the courses data based on the name. This method can now be easily implemented in the service
   // public List<CourseEntity> findByName(String name);
    //to get all the courses data based onthe description . This method can now be easily implemented in the service
   // public List<CourseEntity> findByDescription(String description);

    //TopicEntity property of the course la id property
    public  List<CourseEntity> findByTopicEntityId(String id);
}
