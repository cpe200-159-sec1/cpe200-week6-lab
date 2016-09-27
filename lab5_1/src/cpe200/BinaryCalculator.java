package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        if (a.compareTo(BigDecimal.ZERO) >= 0 && b.compareTo(BigDecimal.ZERO) >= 0) return a.add(b).stripTrailingZeros().toString();
        else throw new RuntimeException();
    }

    public String subtract() throws RuntimeException {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        if (a.compareTo(BigDecimal.ZERO) >= 0 && b.compareTo(BigDecimal.ZERO) >= 0) return a.subtract(b).stripTrailingZeros().toString();
        else throw new RuntimeException();
    }

    public String multiply() throws RuntimeException {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        if (a.compareTo(BigDecimal.ZERO) >= 0 && b.compareTo(BigDecimal.ZERO) >= 0) return a.multiply(b).stripTrailingZeros().toString();
        else throw new RuntimeException();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        if (a.compareTo(BigDecimal.ZERO) >= 0 && b.compareTo(BigDecimal.ZERO) >= 0) {
            if (b.equals(BigDecimal.ZERO)) throw new ArithmeticException();
            else return a.divide(b,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        }
        else throw new RuntimeException();
    }

    public String power() throws RuntimeException {
        Double a = Double.parseDouble(firstOperand.getOperand());
        Double b = Double.parseDouble(secondOperand.getOperand());
        if (a >= 0 && b >= 0){
            a = Math.pow(a,b);
            BigDecimal nate = new BigDecimal(a.toString()).stripTrailingZeros();
            nate = nate.divide(BigDecimal.ONE, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
            return nate.toString();
        }else throw new RuntimeException();
    }

}
