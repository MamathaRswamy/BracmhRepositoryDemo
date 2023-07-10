package demoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ListenerTC1 {
	@Test
	public void demoForListnerListenerTC1() {
		System.out.println(" this is testcase");
	}
	@Test
	public void demoForListner1ListenerTC1() {
		System.out.println(" this is testcase2");
		assertEquals(false, true);
	}
}
