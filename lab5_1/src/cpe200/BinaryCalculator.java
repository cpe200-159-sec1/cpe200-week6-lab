package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal FOP;
    private BigDecimal SOP;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
        FOP = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
        SOP = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {

        if(FOP.intValue() < 0 || SOP.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        }
        return FOP.add(SOP).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
       // return null;
        if(FOP.intValue() < 0 || SOP.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        }
        return FOP.subtract(SOP).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        //return null;
        if(FOP.intValue() < 0 || SOP.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        }
        return FOP.multiply(SOP).stripTrailingZeros().toString();

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
       // return null;
        if(SOP.equals(0)) {
            throw new ArithmeticException("ERROR");
        }
        else if(FOP.intValue() < 0 || SOP.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        }
        return FOP.divide(SOP,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        //return null;
        if(FOP.intValue() < 0 || SOP.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        }
        return FOP.pow(SOP.intValue()).stripTrailingZeros().toString();
    }

}
