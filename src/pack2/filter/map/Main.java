package pack2.filter.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main 
{
	//Give me a person name and his phno who is doing the Software Job
	public static void main(String[] args) 
	{
		Person p1 = new Person("Raju","Phtographer",1234);
		Person p2 = new Person("Mamu","Agriculture",984);
		Person p3 = new Person("Umesh","Music",344);
		Person p4 = new Person("Shahi","Software",34454);
		Person p5 = new Person("Dheema","Contractor",90234);
		Person p6 = new Person("Kiran","Bank Manger",8334);
		Person p7 = new Person("Ashok","Software",13234);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		Stream<Person> stream  = persons.stream();
		
		stream.filter(p -> p.getJob().equals("Software"))
		.map(p -> p.getName()+" "+p.getPhno())
		.forEach(System.out::println);
		

		
		
	}

}
