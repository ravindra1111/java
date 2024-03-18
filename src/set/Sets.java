package set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set obj=new HashSet();
		obj.add(1);
		obj.add(3);
		obj.add(3);
		obj.add(2);
		obj.add(3);
		obj.add(2);
		System.out.println(obj);
		for( int i=0;i<obj.size();i++)
		{
			System.out.println(i);
		}
		Set<String> obj1=new HashSet<String>();
		obj1.add("abc");
		obj1.add("bca");
		obj1.add("cba");
		obj1.add("Ravi");
		obj1.add("Ravi");
		obj1.add("Ravi");
		obj1.add("ravi");
		obj1.remove("ravi");

		System.out.println(obj1);
		System.out.println(obj.size());	

	}

}
