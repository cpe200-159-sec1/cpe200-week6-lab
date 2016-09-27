package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private String operand;                             //check

    public IntegerOperand (Integer d) {
        operand = Integer.toString(d);
    }

    @Override
    public String getOperand() {
        return operand;
    }
}
