package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator()
    {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0 || second.intValue()<0)
        {
            throw new RuntimeException("number is lower than zero");
        }
        BigDecimal sum = first.add(second);
        return sum.stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0 || second.intValue()<0)
        {
            throw new RuntimeException("number is lower than zero");
        }
        BigDecimal sum = first.subtract(second);
        return sum.stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0 || second.intValue()<0)
        {
            throw new RuntimeException("number is lower than zero");
        }
        BigDecimal sum = first.multiply(second);
        return sum.stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0 || second.intValue()<0)
        {
            throw new RuntimeException("number is lower than zero");
        }
        BigDecimal out = first.divide(second,5,4);

        return out.stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.intValue()<0 || second.intValue()<0)
        {
            throw new RuntimeException("number is lower than zero");
        }
        BigDecimal out = first.pow(second.intValue());

        return out.stripTrailingZeros().toString();
    }

}
