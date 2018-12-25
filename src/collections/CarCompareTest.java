/*
 *  Create few instances of Car and add them to a collection.
 *  Have Car implements Comparable interface and override compareTo() 
 *  to order them by ascending order of make of the Car.
 *  Observe the fact that you need to provide the order criteria in compareTo()..
 *  */

package collections;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CarCompareTest {
private CarCompare object1;
private CarCompare object2;
private CarCompare object3;
private CarCompare object4;
	@Before
	public void setUp(){
		object1=new  CarCompare("indica",3423,2001,"Desel");
		object2=new  CarCompare("swift",4523,2001,"Desel");
		object3=new  CarCompare("sumo",1113,2004,"petrol");
		object4=new  CarCompare("maruthi",1111,2001,"Desel");
	}

	@Test
	public void test() {
		 TreeSet<Object> treeSet = new TreeSet<Object>(); 
		 treeSet.add(object1);
		 treeSet.add(object2);
		 treeSet.add(object3);
		 treeSet.add(object4);
//		 Iterator<Object> i = treeSet.iterator(); 
//        while (i.hasNext()) 
//            System.out.println(i.next());
		 String expected="[CarCompare [name=maruthi, number=1111, year=2001, model=Desel], CarCompare [name=sumo, number=1113, year=2004, model=petrol], CarCompare [name=indica, number=3423, year=2001, model=Desel], CarCompare [name=swift, number=4523, year=2001, model=Desel]]";
        System.out.println(treeSet);
        assertEquals(expected, treeSet.toString());
        
		 
	}

}
