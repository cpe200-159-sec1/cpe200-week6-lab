package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{
    private String Operand;
    public DoubleOperand(Double d) {
        this.Operand=Double.toString(d);
    }

    @Override
    public String getOperand()
    {
        return this.Operand;
    }
}
