package s0start;

import org.junit.Assert;
import org.junit.Test;

public class PowerTest {

	
	@Test
	public void PowerTest1(){
		Assert.assertTrue(Power.power(0.5, 2) == Math.pow(0.5, 2));
	}
	
	@Test
	public void PowerTest2(){
		Assert.assertTrue(Power.power(100, 2) == Math.pow(100, 2));
	}
	
	@Test
	public void PowerTest3(){
		Assert.assertTrue(Power.power(-0.5, 2) == Math.pow(-0.5, 2));
	}
	
	@Test
	public void PowerTest4(){
		Assert.assertTrue(Power.power(3.7, 2) == Math.pow(3.7, 2));
	}
	
	@Test
	public void PowerTest5(){
		Assert.assertTrue(Power.power(4, 14) == Math.pow(4, 14));
	}
}

