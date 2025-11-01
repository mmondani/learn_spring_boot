package com.mmondani.springboot.learn_jpa_hibernate.course.springDataJpa;

import com.mmondani.springboot.learn_jpa_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
}
