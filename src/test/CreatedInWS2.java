package test;

public class CreatedInWS2 {

	String commitStr = "Test";
	String server1 = "Server 1";
	String s2 = "S 2";
	String l2 = "L 2";
	String local0901_1 = "Local 0901_1";
	String local0901_2 = "Local 0901_2";
	String L0901_7 = "String Local 090113-7"; // do not commit

	private String getNewString() {
		String ts3 = concatStrs();
		
		return ts3;

	}

	
	private String getNewString1() {
		String ts3 = concatStrs();
		
		return ts3;

	}
	

	private String concatStrs() {
		String ts = "abc";
		String ts2 = ts;
		String ts3 = ts + ts2;
		return ts3;
	}

}
