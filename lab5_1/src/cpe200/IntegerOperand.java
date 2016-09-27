package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private int Operand;
    public IntegerOperand(int i) {
        Operand = i;
    }

    @Override
    public String getOperand() {
        return Integer.toString(Operand);
    }
}
