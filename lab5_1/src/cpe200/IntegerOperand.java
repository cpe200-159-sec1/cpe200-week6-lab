package cpe200;
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