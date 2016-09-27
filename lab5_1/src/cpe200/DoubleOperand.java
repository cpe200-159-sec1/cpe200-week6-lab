package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{
    private  double operand;

    public DoubleOperand(Double d) {
        operand = d;
    }

    @Override
    public String getOperand() {
        return Double.toString(operand);
    }
}
