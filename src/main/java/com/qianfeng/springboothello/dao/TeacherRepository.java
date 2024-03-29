package com.qianfeng.springboothello.dao;

import com.qianfeng.springboothello.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author huangguizhao
 */
@Component
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
