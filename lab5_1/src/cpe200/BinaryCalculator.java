package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal _firstOperand;
    private BigDecimal _secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
        _firstOperand = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
        _secondOperand = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if(_secondOperand.intValue()<0||_firstOperand.intValue()<0)throw new RuntimeException();
        return _firstOperand.add(_secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(_secondOperand.intValue()<0||_firstOperand.intValue()<0)throw new RuntimeException();
        return _firstOperand.subtract(_secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(_secondOperand.intValue()<0||_firstOperand.intValue()<0)throw new RuntimeException();
        return _firstOperand.multiply(_secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(_secondOperand.intValue()<0||_firstOperand.intValue()<0)throw new RuntimeException();
        else if(secondOperand.equals(0))throw new ArithmeticException();
        else return _firstOperand.divide(_secondOperand,5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(_secondOperand.intValue()<0||_firstOperand.intValue()<0)throw new RuntimeException();
        int i = _secondOperand.intValue();
        return _firstOperand.pow(i).stripTrailingZeros().toString();
    }

}
