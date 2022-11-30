package pack1.filter.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterMapMain 
{
	//Requirement : To print names who's starting with "A" along with length 
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Virah Kholi");
		list.add("Ashish Nehera");
		list.add("Sourav Ganguly");
		list.add("Abhinav Mukund");
		list.add("Amit Mishra");
		list.add("RuthuRaj");
		
		Stream<String> stream =list.stream();
		stream.filter(name-> name.startsWith("A"))
		.map(name->name+"  "+name.length())
		.forEach(i -> System.out.println(i));
		
		
		
	}

}
