package teacher.clazz.student.service;

public interface TcsService {
	
	
	//提供参数
	
	
	public void tcsAddStudent(String name,Integer height,Integer weight,Integer clazz_id); //增加一个学生
			
	public void tcsDeleteStudent(Integer id);//通过id删除学生

	public void tcsUpdateStudent(Integer id,String name,Integer height,Integer weight);//更新学生信息

	public void tcsSelectStudent(String name);//通过姓名来查找学生信息
	
	public void tcsSelectStudent(Integer id);//通过学生id来查询学生信息
	
	public void tcsSelectTeacherByStudentId(Integer StudentId);//通过学生id来查询老师信息
	
	public void tcsSelectStudentByTeacherId(Integer TeacherId);//通过老师id来查询老师信息

}
