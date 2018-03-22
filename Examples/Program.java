class Program{
	public static void main(String[] args){		
		Person person = new Person("Pepe");
		Student student = new Student("Carlos", 16, 80);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getAverage());
	}
}