package latihan.pagefactoryobject.scenariotest;

public enum NopcLogin {
	T1("User invalid login"),
	T2("User valid login");
	
	private String testName;
	
	private NopcLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
