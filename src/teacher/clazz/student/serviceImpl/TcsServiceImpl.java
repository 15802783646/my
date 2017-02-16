package teacher.clazz.student.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import teacher.clazz.student.dao.TcsDao;
import teacher.clazz.student.service.TcsService;

@Transactional
//Spring事务的传播行为   
// 上面的注解表示 声明这个service所有方法需要事务管理， 每一个业务方法开始时都会打开一个事务。 

@Service
//@Service用于标注业务层组件
public class TcsServiceImpl implements TcsService {

	@Autowired//此注解表示自动装配，就可以省略掉set方法
	private TcsDao tcsDao;

	

	@Override  //增加一个学生
	public void tcsAddStudent(String name, Integer height, Integer weight,Integer clazz_id) {
		tcsDao.addStudent(name, height, weight,clazz_id);

	}

	@Override //通过id删除学生
	public void tcsDeleteStudent(Integer id) {
		tcsDao.deleteStudentByid(id);

	}

	@Override//更新一个学生的信息
	public void tcsUpdateStudent(Integer id, String name, Integer height,
			Integer weight) {
		tcsDao.updateStudentByid(id, name, height, weight);

	}

	@Override //通过名字查询学生
	public void tcsSelectStudent(String name) {
		tcsDao.selectStudentByName(name);

	}
	
	@Override//通过学生id来查询学生信息
	public void tcsSelectStudent(Integer id) {
		
		tcsDao.selectStudentById(id);
		
	}



	@Override//通过学生id来查找老师信息
	public void tcsSelectTeacherByStudentId(Integer StudentId) {
		tcsDao.selectTeacherByStudentId(StudentId);
		
	}

	@Override//通过老师id来查找学生信息
	public void tcsSelectStudentByTeacherId(Integer TeacherId) {
		tcsDao.selectStudentByteacherId(TeacherId);
		
	}

	

}
