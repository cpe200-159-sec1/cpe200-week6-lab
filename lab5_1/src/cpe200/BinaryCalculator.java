package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal st;
    private BigDecimal nd;

    public BinaryCalculator() {
        firstOperand = null;
        secondOperand = null;
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
        st = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
        nd = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("");
        return st.add(nd).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("");
        return st.subtract(nd).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("");
        return st.multiply(nd).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(isNegative() || nd.equals(0))
            throw new RuntimeException("");
        return st.divide(nd, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("");
        return st.pow(nd.intValue()).stripTrailingZeros().toString();
    }

    private boolean isNegative()
    {
        return (st.doubleValue()<0 || nd.doubleValue()<0);
    }

}