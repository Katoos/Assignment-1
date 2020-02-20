
public interface ICalculator {
	int add(int x, int y);
	float divide(int x, int y) throws RuntimeException;
}

class Calc implements ICalculator {
	int x,y ;

	public int add (int n1, int n2) {
		return n1 + n2 ;
	}
	public float divide (int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Undefined Number!");
		}
		return (float)n1 / (float)n2;
	}
}
