package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private int operand;
    public IntegerOperand(int i) {
        this.setOperand(i);
    }

    @Override
    public String getOperand() {
        return Integer.toString(operand);
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }
}
