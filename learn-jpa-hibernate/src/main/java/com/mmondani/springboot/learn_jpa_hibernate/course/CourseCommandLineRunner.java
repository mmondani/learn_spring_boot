package com.mmondani.springboot.learn_jpa_hibernate.course;

import com.mmondani.springboot.learn_jpa_hibernate.course.jdbc.CourseJdbcRepository;
import com.mmondani.springboot.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import com.mmondani.springboot.learn_jpa_hibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        /*repository.insert(new Course(1, "Learn AWS Now", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure", "in28minutes"));
        repository.insert(new Course(3, "Learn DevOps", "in28minutes"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));*/

        repository.save(new Course(1, "Learn AWS Now Data JPA", "in28minutes"));
        repository.save(new Course(2, "Learn Azure Data JPA", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps Data JPA", "in28minutes"));

        repository.deleteById(2l);

        System.out.println(repository.findById(1l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));
    }
}
