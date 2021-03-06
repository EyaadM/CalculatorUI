// Tanay Shah
package model;
// Import control OPERATOR Enum
import control.MathCalc.OPERATOR;

// Declare calculator model class
public class CalculatorModel {

    // Declare answer variable
    // Tanay Shah
    public double calcAnswerModel;

    //empty constructor
    public CalculatorModel() {
    }

    // Constructor with arguments, passes to control function
    // Tanay Shah
    public CalculatorModel(double arg1, OPERATOR mathOp, double arg2) {
        // Set var equal to the return value of the control function
        // Eventually the goal is to make control into a class and again create the object here to access the answer variable
        this.calcAnswerModel = control.MathCalc.calculateIt(arg1, mathOp, arg2);
    }
}