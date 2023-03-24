package net.bukhari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bukhari.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
