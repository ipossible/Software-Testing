import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class test {

	private int a[] = {3,2,1};
	private int b[] = {10,9,8,7,6,5,4,3,2,1,0};
	private Object[] c = {a,b};
	private Sorting sort = null;
	
	@Before
	public void setUp(){
		sort = new Sorting();
	}
	
	@Test
	public void testSort(){
		sort.insertionSort(a);
		assertEquals(true,sort.isSorted(a));
		sort.quicksort(b);
		assertEquals(true,sort.isSorted(b));
		sort.swapReferences(c,0,1);
	}
}
