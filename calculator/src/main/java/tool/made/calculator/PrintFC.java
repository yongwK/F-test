package tool.made.calculator;

public class PrintFC {

	public String print(String str) {
		String rtnStr = "";
		
		if(str instanceof String) {
			rtnStr = str;
		}
		
		return rtnStr;
	}
	
	public String printIntStr(int num) {
		String rtnStr = "";
		
		if(Integer.valueOf(num) instanceof Integer) {
			rtnStr = String.valueOf(num);
		}
		return rtnStr;
	}
	
	public void endString() {
		System.out.println("END ..");
	}
	

	public void end() {
		System.out.println("never Ending");
	}
	

	public void whyNot() {
		System.out.println("branch 와 master 와 conflict 만들기");
	}

}
