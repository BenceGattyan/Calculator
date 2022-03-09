package calculator.operations;

public class Multiplication extends Operation {

	@Override
	public String getName() {
		return "multiplication";
	}

	@Override
	public String getOperator() {
		return "*";
	}
    //ae
	@Override
	public double calc() {
		return a*b;
	}

}
