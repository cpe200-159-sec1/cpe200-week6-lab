package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = BigDecimal.ZERO;
        secondOperand = BigDecimal.ZERO;
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add(){
        checkNegativeVaule();                                //check that input >= 0
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
                                                            //toString bc rq String
    }

    public String subtract(){
        checkNegativeVaule();                               //check that input >= 0
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
                                                            //toString bc rq String
    }

    public String multiply(){
        checkNegativeVaule();                               //check that input >= 0
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
                                                            //toString bc rq String
    }

    /* This method should throw an exception when divide by zero */
    public String division(){
        checkNegativeVaule();
        checkDivideByZero();
        return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        checkNegativeVaule();
        return BigDecimal.valueOf(
                Math.pow(
                        firstOperand.doubleValue(),
                        secondOperand.doubleValue()
                                                    )
                                                        ).stripTrailingZeros().toString();
    }

    private void checkNegativeVaule() {
        if (firstOperand.compareTo(BigDecimal.ZERO) < 0 || secondOperand.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Error, input less then 0");
            }
        }

    private void checkDivideByZero() {
        if (secondOperand.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException();
        }
    }


}
