/*  
 * Create a simple map to store all of our class students’
 *  names and their favorite fruits.
 *  Try to get their favorite fruit by giving their name.
 *  Also, list all the names and their favorite fruits saperately.
 *  */

package collections;

import static org.junit.Assert.*;

import java.util.HashMap;
//import java.util.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class StudentSimpleMapTestCase {
	private StudentClas object1;
	private StudentClas object2;
	private StudentClas object3;
	private StudentClas object4;
	
		@Before
		public void test() 
		{
			object1=new StudentClas("bhanu");
			object2=new StudentClas("shabzan");
			object3=new StudentClas("ravi");	
			object4=new StudentClas("Hundai");	
		}
		@Test
		public void testUsingHashSet() {
			HashMap<String,String> hashmap=new HashMap<String,String>();
			hashmap.put(object1.getName(),"banana");
			hashmap.put(object2.getName(),"apple");
			hashmap.put(object3.getName(),"graps");
			hashmap.put(object4.getName(),"pineapple");
			Set keys = hashmap.keySet();
			 for (Iterator i = keys.iterator(); i.hasNext(); ) {
			       String key = (String) i.next();
			       String value = (String) hashmap.get(key);
			      System.out.println("key= "+key+" value= "+value);
			      //System.out.println(value);
			   }
		}
}