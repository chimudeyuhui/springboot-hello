package com.qianfeng.springboothello;

import com.qianfeng.springboothello.dao.TeacherRepository;
import com.qianfeng.springboothello.entity.TProduct;
import com.qianfeng.springboothello.entity.Teacher;
import com.qianfeng.springboothello.mapper.TProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloApplicationTests {

	@Autowired
	private TProductMapper productMapper;

	@Autowired
	private TeacherRepository teacherRepository;

	@Test
	public void contextLoads() {
		TProduct product = productMapper.selectByPrimaryKey(2L);
		System.out.println(product.getName());
	}

	@Test
	public void jpaTest(){
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("huangguizhao");
		teacher.setAge(18);
		//
		teacherRepository.save(teacher);
	}

}
