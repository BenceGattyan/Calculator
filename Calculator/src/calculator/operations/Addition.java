package calculator.operations;

public class Addition extends Operation{

	@Override
	public String getName() {
		return "addition";
	}

	@Override
	public String getOperator() {
		return "+";
	}

	//bruh2
	@Override
	public double calc() {
		return a+b;
	}

}
