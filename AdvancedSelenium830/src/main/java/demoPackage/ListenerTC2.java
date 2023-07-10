package demoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ListenerTC2 {
	@Test
	public void demoForListnerListenerTC2() {
		System.out.println(" this is testcase");
	}
	@Test
	public void demoForListner1ListenerTC2() {
		System.out.println(" this is testcase2");
		assertEquals(false, true);
	}
}
