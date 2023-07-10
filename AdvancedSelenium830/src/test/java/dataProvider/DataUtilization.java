package dataProvider;

import org.testng.annotations.Test;

public class DataUtilization {
	@Test(dataProvider = "urname",dataProviderClass = DataprovideClassssss.class)
	public void demo(String s) {
		System.out.println(s);
	}
}
