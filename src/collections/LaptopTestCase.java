package collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class LaptopTestCase {
private Laptop object1, object2, object3;


	@Before
	public void test() 
	{
		object1=new Laptop("Samsung",1,"Windows10","Hardcore");
		object2=new Laptop("Lenovo",123,"Windows10","Hardcore");
		object3=new Laptop("Dell",211,"Windows10","Hardcore");	
	}
	@Test
	public void testUsingHashSet()
	{
		HashSet<Object> set=new HashSet<Object>();
		set.add(object1);
		set.add(object2);
		set.add(object3);
//		 Iterator<Object> i = set.iterator(); 
//	        while (i.hasNext()) 
//	            System.out.println(i.next()); 
		String expected="[Laptop [company=Dell, model=211.0, operatingSystem=Windows10, processor=Hardcore], Laptop [company=Lenovo, model=123.0, operatingSystem=Windows10, processor=Hardcore], Laptop [company=Samsung, model=1.0, operatingSystem=Windows10, processor=Hardcore]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
