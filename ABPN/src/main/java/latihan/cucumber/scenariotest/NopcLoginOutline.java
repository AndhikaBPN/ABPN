package latihan.cucumber.scenariotest;

public enum NopcLoginOutline {
	T1("User invalid login Outline");
	
	private String testName;
	
	private NopcLoginOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
