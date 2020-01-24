package com.javabrains.courseapidata.Service;

import com.javabrains.courseapidata.Entity.CourseEntity;
import com.javabrains.courseapidata.Service.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
   /*private List<TopicEntity> topics = new ArrayList<>(Arrays.asList(
            new TopicEntity("s1", "spring", "spring course"),
            new TopicEntity("j1", "java", "java course"),
            new TopicEntity("r1", "react", "react course")
    ));
*/



    public List<CourseEntity> getAllCourse(String topicId) {
        List <CourseEntity> courses =  new ArrayList<>();
        courseRepository.findByTopicEntityId(topicId).forEach(courses::add);
           return courses;

    }

    public CourseEntity getCourse(String id) {
        //courseRepository.findByName("You can pass whatever name you want");// only those courses data with that particular name are returned as an output
        //courseRepository.findByDescription("You can pass whatever description you want");// only those courses data with that particular description are returned as an output
        return courseRepository.findById(id).get();
    }

    public void addCourse(CourseEntity courseEntity) {
        courseRepository.save(courseEntity);
    }

    public void updateCourse(CourseEntity courseEntity) {

      courseRepository.save(courseEntity);


    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

}

