package demoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ListenerTC {
	@Test
	public void demoForListnerListenerTC() {
		System.out.println(" this is testcase");
	}
	@Test
	public void demoForListner1ListenerTC() {
		System.out.println(" this is testcase2");
		assertEquals(false, true);
	}
}
