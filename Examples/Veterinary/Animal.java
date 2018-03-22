class Animal {
	private String id;
	private String name;
	private int age;
	private String breed;

	public Animal(String name, int age, String breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String toString(){
		return "ID: " + id + " - name: " + name + " - age: " + age + " - breed: " + breed ;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}
}
