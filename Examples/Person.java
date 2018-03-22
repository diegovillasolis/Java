public class Person{
	private String name;
	private int age;
	public static String company = "Truextend";

	public Person(){
		name = "";
		age = 0;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(String name){
		this.name = name;
	}

	public Person(int age){
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}