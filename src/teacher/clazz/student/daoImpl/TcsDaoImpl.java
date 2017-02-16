package teacher.clazz.student.daoImpl;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import teacher.clazz.student.Clazz;
import teacher.clazz.student.Student;
import teacher.clazz.student.Teacher;
import teacher.clazz.student.dao.TcsDao;

@Repository
public class TcsDaoImpl implements TcsDao {

	@Autowired
	// 自动注入
	private SessionFactory sessionFactory;

	// 获取当前线程
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	// 增加一个学生
	public void addStudent(String name, Integer height, Integer weight,
			Integer clazz_id) {
		String sql = "insert into Student values(null,?,?,?,?)";

		getSession().createSQLQuery(sql).setString(0, name)
				.setInteger(1, height).setInteger(2, weight)
				.setInteger(3, clazz_id).executeUpdate();

	}

	@Override
	// 通过id来删除学生
	public void deleteStudentByid(Integer id) {

		String hql = "delete from Student where id=?";

		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}

	@Override
	// 通过id来更新学生的信息
	public void updateStudentByid(Integer id, String name, Integer height,
			Integer weight) {

		String hql = "update Student set name=?,height=?,weight=? where id=?";

		getSession().createQuery(hql).setString(0, name).setInteger(1, height)
				.setInteger(2, weight).setInteger(3, id).executeUpdate();
	}

	@Override
	// 通过姓名来查找学生的信息
	public void selectStudentByName(String name) {

		String hql = "from Student where name=?";

		List<Student> students = getSession().createQuery(hql)
				.setString(0, name).list();

		for (Student student : students) {
			System.out.println(student);
		}

	}

	@Override
	// 通过老师id来查找学生信息
	public void selectStudentById(Integer id) {
		String hql = "from Student where id=?";

		List<Student> students = getSession().createQuery(hql)
				.setInteger(0, id).list();

		for (Student student : students) {
			System.out.println(student);
		}

	}

	@Override
	// 通过学生id来查找老师信息
	public void selectTeacherByStudentId(Integer id) {

		String sql = "SELECT Teacher.* FROM Teacher JOIN Clazz ON Teacher.id = Clazz.TEACHER_ID JOIN Student ON Clazz.id = Student.CLAZZ_ID WHERE Student.id = ?";

		SQLQuery sqlQuery=getSession().createSQLQuery(sql);
		sqlQuery.addEntity(Teacher.class);//进行实体关联   ,这个类必须要一个无参的构造器
		sqlQuery.setInteger(0, id);//配置参数
		
		List<Teacher> teachers=(List<Teacher>)sqlQuery.list();//得到结果集
		
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
		
		
	}

	@Override
	// 通过老师id来查询学生信息
	public void selectStudentByteacherId(Integer id) {

		String hql = "select Student.* from Student join Clazz on Student.CLAZZ_ID=Clazz.id join Teacher on Clazz.TEACHER_ID=Teacher.id where Teacher.id=?";

		SQLQuery  sqlQuery= getSession().createSQLQuery(hql);
			sqlQuery.addEntity(Student.class);//进行实体关联   ,这个类必须要一个无参的构造器
			sqlQuery.setInteger(0, id);//配置参数
		List<Student> students=(List<Student>)sqlQuery.list();//得到结果集
		
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
