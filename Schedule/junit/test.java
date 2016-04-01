import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;


public class test {
	@Test
	public void test() {
		List<Work> work = new ArrayList<Work>() ;
		Work wk1 = new Work("n1",2,5);
		Work wk2 = new Work("n2",3,4);
		Work wk3 = new Work("n3",7,9);
		work.add(wk1);
		work.add(wk2);
		work.add(wk3);
		List<Double> array1 = new ArrayList<Double>();
		List<Double> array2 = new ArrayList<Double>();
		Schedule sch = new Schedule();
		array1 = sch.FCFS(work);
		array2 = sch.SJF(work);
		assertEquals(1,array1.get(0),0.0);
		assertEquals(1,array1.get(1),0.0);
		assertEquals(1,array2.get(0),0.0);
		assertEquals(1,array2.get(1),0.0);
	}

}
