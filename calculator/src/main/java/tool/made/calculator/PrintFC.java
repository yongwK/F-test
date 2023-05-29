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
	
	public void branchChange() {
		System.out.println("create func branch change");
	}
	
	public void branchChange2() {
		System.out.println("22222222222222");
	}
	
	public void branchChange23() {
		System.out.println("2222222222222233333333333");
	}
}
