package teacher.clazz.student;

public class Student {

	private Integer id;
	
	private String name;
	
	private Integer height;
	
	private Integer weight;
	
	private Clazz clazz;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(Integer id, String name, Integer height, Integer weight,
			Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.clazz = clazz;
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

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", height=" + height
				+ ", weight=" + weight + ", clazz=" + clazz + "]";
	}

	

	
	
	
	
	
	
}
