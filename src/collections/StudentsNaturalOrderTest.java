


/*
 * Add all the names of our class students randomly to a collection,
 *iterate through them and print.
 Observe that collection keeps these elements in a natural order.package collections;
 
*/
package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class StudentsNaturalOrderTest {

	private Students object1;
	private Students object2;
	private Students object3;
	private Students object4;
	@Before 
	public void setup()
	{
	 object1=new Students("bhanu");
	 object2=new Students("shabZan");
	 object3=new Students("hari");
	 object4=new Students("viji");
	 
	}
	

	@Test
	public void test() {
		TreeSet<Object> treeset = new TreeSet<Object>();
		treeset.add(object1);
		treeset.add(object3);
		treeset.add(object2);
		treeset.add(object4);
//		
//		 Iterator<Object> i = treeset.iterator(); 
//	        while (i.hasNext()) 
//	            System.out.println(i.next()); 
	        System.out.println(treeset);
	        String expected="[Students [name=bhanu], Students [name=hari], Students [name=shabZan], Students [name=viji]]";
		 
	        assertEquals(expected, treeset.toString());
		
	}
	}
