package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private String Operand;

    public IntegerOperand(int i) {
        this.Operand=Integer.toString(i);
    }

    @Override
    public String getOperand()
    {
        return this.Operand;
    }
}
