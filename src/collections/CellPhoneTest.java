package collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CellPhoneTest {
private Cell object1;
private Cell object2;
private Cell object3;
private Cell object4;


	@Before
	public void test() 
	{
		object1=new Cell("Samsung",3,"SmartPhone",11,3400);
		object2=new Cell("Iphone",4,"Slim",20,7450);
		object3=new Cell("Nokia",33,"whiteShine",202,8000);	
		object4=new Cell("Nokia",33,"whiteShine",202,8000);	
	}
	@Test
	public void testUsingHashSet()
	{
		HashSet<Object> set=new HashSet<Object>();
		set.add(object1);
		set.add(object2);
		set.add(object3);
		set.add(object4);
		
//		 Iterator<Object> i = set.iterator(); 
//	        while (i.hasNext()) 
//	            System.out.println(i.next()); 
		System.out.println(set);
		String expected="[Cell [company=Iphone, model=4, description=Slim, operatingSystem=20, price=7450], Cell [company=Nokia, model=33, description=whiteShine, operatingSystem=202, price=8000], Cell [company=Samsung, model=3, description=SmartPhone, operatingSystem=11, price=3400]]";
		assertEquals(expected, set.toString());
	}

}
