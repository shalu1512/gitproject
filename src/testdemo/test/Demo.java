package testdemo.test;

public class Demo {

	public static void main(String[] args) {
		String firstName = "Shubham";
		String lastName = "Chaursiya";
		String concat = firstName.concat(" ").concat(lastName);
		String[] split = concat.split(" ");
		firstName = split[1];
		lastName = split[0];
		System.out.println("FirstName = " + firstName);
		System.out.println("LastName = " + lastName);
	}
}
