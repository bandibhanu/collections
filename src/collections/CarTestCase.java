package collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CarTestCase {
private Car object1;
private Car object2;
private Car object3;
private Car object4;


	@Before
	public void test() 
	{
		object1=new Car("Mahindra","jive",1997,450000);
		object2=new Car("Maruthi","swift",2010,7450000);
		object3=new Car("Hundai","ceete",2012,800000);	
		object4=new Car("Hundai","ceete",2012,800000);	
	}
	@Test
	public void testUsingHashSet()
	{
		HashSet<Object> set=new HashSet<Object>();
		set.add(object1);
		set.add(object2);
		set.add(object3);
		set.add(object4);
		
		String expected="[Car [make=Maruthi, model=swift, year=2010, price=7450000], Car [make=Hundai, model=ceete, year=2012, price=800000], Car [make=Mahindra, model=jive, year=1997, price=450000]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
