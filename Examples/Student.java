public class Student extends Person{
	private double average;

	public Student(String name, int age, double average){
		super(name, age);
		this.average = average;
	}

	public void setAverage(double average){
		this.average = average;
	}

	public double getAverage(){
		return average;
	}
}