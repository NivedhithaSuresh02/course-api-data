package com.javabrains.courseapidata.Controller;

import com.javabrains.Topicapidata.Entity.TopicEntity;
import com.javabrains.courseapidata.Entity.CourseEntity;
import com.javabrains.courseapidata.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<CourseEntity> getAllCourse(@PathVariable String id)
    {
        return courseService.getAllCourse(id);
    }
    //to get a single record based on id
    @RequestMapping("topics/{topicId}/courses/{id}")
    public CourseEntity getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }
    //to create a new record in the list
    @RequestMapping(method = RequestMethod.POST,value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody CourseEntity courseEntity,@PathVariable String topicId)
    {
        courseEntity.setTopicEntity(new TopicEntity(topicId,"",""));
        courseService.addCourse(courseEntity);
    }

    //to update a value in the list
    @RequestMapping(method = RequestMethod.PUT,value="topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody CourseEntity courseEntity , @PathVariable String id,@PathVariable String topicId)
    {
        courseEntity.setTopicEntity(new TopicEntity(topicId,"",""));
        courseService.updateCourse(courseEntity);
    }
    //to delete a value from the list
    @RequestMapping(method = RequestMethod.DELETE,value="topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }

}
