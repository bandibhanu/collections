package collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SchoolTestCase {
private School object1;
private School object2;
private School object3;
private School object4;


	@Before
	public void test() 
	{
		object1=new School("bhanu","Hyderabad","Sasi School","RangaReddy",11);
		object2=new School("Shabzan","KamaReddy","Raman High School","KamaReddy",7);
		object3=new School("pavan","Sathupalli","Gowtham Model School","Khammam",8);	
		object4=new School("bhanu","Hyderabad","Sasi School","RangaReddy",11);
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
//		
		String expected="[School [name=pavan, city=Sathupalli, school=Gowtham Model School, district=Khammam, greatSchoolRanking=8], School [name=bhanu, city=Hyderabad, school=Sasi School, district=RangaReddy, greatSchoolRanking=11], School [name=Shabzan, city=KamaReddy, school=Raman High School, district=KamaReddy, greatSchoolRanking=7]]";
		assertEquals(expected, set.toString());
		System.out.println(set);
	}

}
