package teacher.clazz.student;

public class Clazz {

	private Integer id;
	
	private String name;
	
	private Teacher teacher;
	
	public Clazz() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + ", teacher=" + teacher
				+ "]";
	}



	

	
	
}
