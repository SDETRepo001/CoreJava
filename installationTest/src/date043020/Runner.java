package date043020;

public class Runner {

	public static void main(String[] args) {

		Student st1 = new Student("kabir", 50);

		Student st2 = new Student("jack", 21);
		Student st3 = new Student("Ahmad", 45);

		{

		System.out.println("**Name" + "**" + st1.name + "\n" + "**Age**" + st1.age + "\n" + "**Name**" + st2.name
		+ "\n" + "**Age" + "**" + st2.age + "\n**" + st3.name + "**\n**Age**" + st3.age);

		}

	}

}
