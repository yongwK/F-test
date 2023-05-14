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
}
