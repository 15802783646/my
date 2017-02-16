package Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import teacher.clazz.student.service.TcsService;

public class TestStudent {

	private ApplicationContext ctx=null;
	
	private TcsService tcsService;
	
	{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		tcsService=	ctx.getBean(TcsService.class);
	}
	
	@Test
	//增加一个学生
	public void addtest(){
	tcsService.tcsAddStudent("huang00", 180, 155, 1);
	}
	
	@Test//根据id来删除一个学生
	public void deleteTest(){
		
	tcsService.tcsDeleteStudent(3);	
	}
	
	@Test//修改学生的信息
	public void updateTest(){
		tcsService.tcsUpdateStudent(2, "lihua", 200, 150);
		
	}
	
	@Test//通过名字得到学生的详细信息
	public void selectTest(){
		tcsService.tcsSelectStudent("lihua");
		
	}
	
	@Test//通过id得到学生的信息
	public void selectById(){
		tcsService.tcsSelectStudent(1);
	}
	
	@Test//通过学生id查询老师信息
	public void selectTeacherByStudentId(){
		
		tcsService.tcsSelectTeacherByStudentId(3);
		
	}
	
	@Test// 通过老师id来查询学生信息
	public void selectStudentByTeacherId(){
		
		tcsService.tcsSelectStudentByTeacherId(1);
	}
	
}
