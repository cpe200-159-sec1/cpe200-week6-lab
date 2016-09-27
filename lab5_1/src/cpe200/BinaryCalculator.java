package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
     if(firstOperand.compareTo(BigDecimal.ZERO) <0 || secondOperand.compareTo(BigDecimal.ZERO)<0){
         throw new RuntimeException("ERROR");
     }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <0 || secondOperand.compareTo(BigDecimal.ZERO)<0){
            throw new RuntimeException("ERROR");
        }
              return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
      if(firstOperand.compareTo(BigDecimal.ZERO) <0 || secondOperand.compareTo(BigDecimal.ZERO)<0){
          throw new RuntimeException("ERROR");
      }
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if ((secondOperand.compareTo(BigDecimal.ZERO) < 0 || firstOperand.compareTo(BigDecimal.ZERO)<0))
                      throw new RuntimeException("Argument 'divisor' is 0");
             if ((secondOperand.compareTo(BigDecimal.ZERO) == 0 || firstOperand.compareTo(BigDecimal.ZERO)==0))
                       throw new ArithmeticException("error");
              secondOperand = firstOperand.divide(secondOperand, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
              return secondOperand.toString();
    }

    public String power() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <0 || secondOperand.compareTo(BigDecimal.ZERO)<0){
            throw new RuntimeException("ERROR");
        }
        return BigDecimal.valueOf((Math.pow(Double.valueOf(firstOperand.toString()),Double.valueOf(secondOperand.toString())))).stripTrailingZeros().toString();
    }

}




