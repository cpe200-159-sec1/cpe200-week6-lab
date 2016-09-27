package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    BigDecimal num1;
    BigDecimal num2;

    public BinaryCalculator() {

    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand=operand;
        num1=new BigDecimal(this.firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand=operand;
        num2=new BigDecimal(this.secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=num1.add(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String subtract() throws RuntimeException {
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=num1.subtract(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String multiply() throws RuntimeException {
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=num1.multiply(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else if(num2.intValue()==0)
        {
            throw new ArithmeticException("ERROR divisor is zero");
        }
        else
        {
            BigDecimal sent=num1.divide(num2,5,5);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        if (num1.intValue() < 0 || num2.intValue() < 0) {
            throw new RuntimeException("Operand is negative");
        } else {
            double dnum1 = num1.doubleValue();
            double dnum2 = num2.doubleValue();
            DoubleOperand temp = new DoubleOperand(Math.pow(dnum1, dnum2));
            BigDecimal sent = new BigDecimal(temp.getOperand());
            return sent.stripTrailingZeros().toString();
        }
    }
}
