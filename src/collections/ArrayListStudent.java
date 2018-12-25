package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class ArrayListStudent {
	private Student object1;
	private Student object2;
	private Student object3;
	private Student object4;
	@Before 
	public void setup()
	{
	 object1=new Student("bhanu");
	 object2=new Student("ShabZan");
	 object3=new Student("hari");
	 object4=new Student("viji");
	 
	}
	

	@Test
	public void test() {
		ArrayList<Object> arrayList=new ArrayList<Object>();
		arrayList.add(object1);
		arrayList.add(object3);
		arrayList.add(object2);
		arrayList.add(object4);
		String expected="[Student [Name=bhanu], Student [Name=hari], Student [Name=ShabZan], Student [Name=viji]]";
		System.out.println(arrayList);
		assertEquals(expected, arrayList.toString());
	}

}
