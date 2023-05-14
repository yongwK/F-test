package tool.made.calculator;

public class CalculatorServiceImpl implements CalulatorService {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}

	@Override
	public int ddouble(int a, int b) {
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		return a/b;
	}

}
