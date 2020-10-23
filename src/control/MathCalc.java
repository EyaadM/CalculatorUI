package control;
import java.lang.Math;
public class MathCalc {
	
	public static enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, MODULUS, EXPONENT, LOG };
	public static double calculateIt(double arg1, OPERATOR mathOp, double arg2) {

		double calcAnswer;
		switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
			case MODULUS:
				calcAnswer = arg1 % arg2;
				break;
			case EXPONENT:
				calcAnswer = Math.pow(arg1,arg2);
				break;
			case LOG:
				calcAnswer = Math.log10(arg1);
				break;
	        case NOOP:
	        default:	
	            calcAnswer = arg1;
	    }
		return calcAnswer;
	}
	

}
