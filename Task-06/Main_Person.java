package task_6;

public class Main_Person {

	public static void main(String[] args) {
		
		Person person = new Person("Naguna Shri", 18);
		System.out.println(person.getName() + " is " + person.getAge() + " years old.");
		
		person.setName("Harshitha");
		person.setage(21);
		
		System.out.println("\nSet new name and age : ");
		System.out.println( person.getName() + " is " + person.getAge() + " years old.");
	}

}
