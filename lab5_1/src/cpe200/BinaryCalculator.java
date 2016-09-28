package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal first;
    private BigDecimal second;


    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
        first = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
        second = new BigDecimal(secondOperand.getOperand());
    }
    public void checkRuntimeException() {
        if (first.intValue() < 0 || second.intValue() < 0) {
            throw new RuntimeException("Operand is negative");
        }
    }
    public String add() throws RuntimeException {
        checkRuntimeException();
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        checkRuntimeException();
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        checkRuntimeException();
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        checkRuntimeException();
        return first.divide(second, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        checkRuntimeException();
        return first.pow(second.intValue()).stripTrailingZeros().toString();

    }
}
