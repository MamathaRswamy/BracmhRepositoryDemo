package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Methods {
	@DataProvider(name = "ur name")
	public Object[] demo() {
		Object[] s={"demo","sample","manual","sql" };
		return s;
	}
	@Test(dataProvider = "ur name")
	public void testmethod(String s) {
		System.out.println(s);
	}
}
