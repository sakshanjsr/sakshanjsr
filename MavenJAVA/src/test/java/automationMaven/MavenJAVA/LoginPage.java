package automationMaven.MavenJAVA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {

	@Test(dataProvider = "setData", groups = "Sanity" )
	public void login(String url) {
		System.out.println(url);

	}

	@Test(groups = "Regression")
	@Parameters({ "url" })
	public void login2(String param) {
		System.out.println(param);
	}

	@DataProvider(name = "setData")
	public String[][] sendDATA() {
		return new String[][] { { "url1" }, { "url2" }, { "url3" } };
	}

}
