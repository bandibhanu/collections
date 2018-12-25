package collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTestCase {
private Television object1;
private Television object2;
private Television object3;
private Television object4;



	@Before
	public void test() 
	{
		object1=new Television("Samsung","LCD",true,45000);
		object2=new Television("LG","LED",false,7500);
		object3=new Television("Panasonic","plasma",true,80000);	
		object4=new Television("Panasonic","plasma",true,80000);	
	}
	@Test
	public void testUsingHashSet()
	{
		HashSet<Object> set=new HashSet<Object>();
		set.add(object1);
		set.add(object2);
		set.add(object3);
		set.add(object4);
		String expected="[Television [company=Panasonic, type=plasma, ThreeDEnabled=true, price=80000], Television [company=LG, type=LED, ThreeDEnabled=false, price=7500], Television [company=Samsung, type=LCD, ThreeDEnabled=true, price=45000]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
