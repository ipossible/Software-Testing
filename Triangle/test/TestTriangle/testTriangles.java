package TestTriangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testTriangles {

	private int a;
	private int b;
	private int c;
	private String expected;
	private String result = null;
	
	public testTriangles(int a,int b, int c, String expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected= expected;
		
		}
	
	@Parameters
	public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
	{1,1,1,"equilateral"},
	{2,3,4,"scalene"},
	{3,5,5,"isosceles"},
	{6,6,8,"isosceles"}
	});
	}
	
	@Test
	public void test() {
	assertEquals(this.expected,triangles.triangleshape(a,b,c));
	}
	
}
