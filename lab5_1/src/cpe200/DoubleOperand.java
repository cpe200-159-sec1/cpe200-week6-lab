package cpe200;

public class DoubleOperand implements IOperand{
    private Double operand;
    public DoubleOperand(Double d) {
        this.setOperand(d);
    }
    @Override
    public String getOperand() {
        return Double.toString(operand);
    }
    public void setOperand(Double operand) {
        this.operand = operand;
    }
}