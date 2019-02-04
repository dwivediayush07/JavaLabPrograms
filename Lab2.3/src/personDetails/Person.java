package personDetails;

public class Person {
	String firstName;
	String lastName;
	char gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	Person() {
		System.out.println("In Default constructor block");
	}
	Person(String firstName,String lastName,char gender) {
		System.out.println("In Parameterized constructor block");
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	public static void main(String args[]) {
		Person obj1=new Person();
		Person obj2=new Person("P_First","P_Last",'G');
		obj1.setFirstName("First");
		obj1.setLastName("Last");
		obj1.setGender('M');
		System.out.println("Default constructor:");
		System.out.println("First name: " + obj1.getFirstName());
		System.out.println("Last name: " + obj1.getLastName());
		System.out.println("Gender :" + obj1.getGender());
		System.out.println("---------------------------");
		System.out.println("Parameterized constructor");
		System.out.println("First name: " + obj2.firstName);
		System.out.println("Last name: " + obj2.lastName);
		System.out.println("Gender:" + obj2.gender);
	}
}