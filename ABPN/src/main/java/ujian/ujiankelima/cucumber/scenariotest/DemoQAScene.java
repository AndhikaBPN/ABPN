package ujian.ujiankelima.cucumber.scenariotest;

public enum DemoQAScene {
	T1("Login user"),
	T2("Register user");
	
	private String testName;
	
	private DemoQAScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
