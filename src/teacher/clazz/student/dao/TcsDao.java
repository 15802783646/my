package teacher.clazz.student.dao;

public interface TcsDao {

	public void addStudent(String name,Integer height,Integer weight,Integer clazz_id);//增加学生
	
	public void deleteStudentByid(Integer id);//根据id删除学生
	
	public void updateStudentByid(Integer id,String name,Integer height,Integer weight);//根据id来修改学生的信息
	
	public void selectStudentByName(String name);//根据学生的名字来查找学生的信息
	
	public void selectStudentById(Integer id); //根据学生的id来查找学生的信息
	
	public void selectTeacherByStudentId(Integer id);//通过学生id来查找所对应的老师信息
	
	public void selectStudentByteacherId(Integer id);//通过老师id来超找学生的信息
	
	
	
}
