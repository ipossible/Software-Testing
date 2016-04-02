import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class test {
	private long[] lborder1 = {-1,-1,-1};
	private long[] lborder2 = {1,2,3};
	private long[] lborder3 = {1,1,1};
	private long[] lborder4 = {2,2,3};
	private long[] lborder5 = {3,4,5};
	private Triangle tri1 = null;
	private Triangle tri2 = null;
	private Triangle tri3 = null;
	private Triangle tri4 = null;
	private Triangle tri5 = null;
	
	@Before
	public void setUp(){
		tri1 = new Triangle(lborder1[0],lborder1[1],lborder1[2]);
		tri2 = new Triangle(lborder2[0],lborder2[1],lborder2[2]);
		tri3 = new Triangle(lborder3[0],lborder3[1],lborder3[2]);
		tri4 = new Triangle(lborder4[0],lborder4[1],lborder4[2]);
		tri5 = new Triangle(lborder5[0],lborder5[1],lborder5[2]);
	}
	
	@Test
	public void testTri(){
		assertEquals(false,tri1.isTriangle(tri1));
		assertEquals("Illegal",tri1.getType(tri1));
		assertEquals(false,tri2.isTriangle(tri2));
		assertEquals("Illegal",tri2.getType(tri2));
		assertEquals(true,tri3.isTriangle(tri3));
		assertEquals("Regular",tri3.getType(tri3));
		assertEquals(true,tri4.isTriangle(tri4));
		assertEquals("Isosceles",tri4.getType(tri4));
		assertEquals(true,tri5.isTriangle(tri5));
		assertEquals("Scalene",tri5.getType(tri5));
		for(int i = 0; i <= 2; i++)
		{
			assertEquals(lborder1[i],tri1.getBorders()[i]);
		}
		for(int i = 0; i <= 2; i++)
		{
			assertEquals(lborder2[i],tri2.getBorders()[i]);
		}
		for(int i = 0; i <= 2; i++)
		{
			assertEquals(lborder3[i],tri3.getBorders()[i]);
		}
		for(int i = 0; i <= 2; i++)
		{
			assertEquals(lborder4[i],tri4.getBorders()[i]);
		}
		for(int i = 0; i <= 2; i++)
		{
			assertEquals(lborder5[i],tri5.getBorders()[i]);
		}
	}
}

