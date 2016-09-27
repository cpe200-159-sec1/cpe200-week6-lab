package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private Float solve;
    private DecimalFormat form = new DecimalFormat("###.#####");

    public BinaryCalculator() {

    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        if(Float.parseFloat(firstOperand.getOperand())<0 || Float.parseFloat(secondOperand.getOperand())<0){
            throw new RuntimeException("Negative number exist");
        }
        try {
            solve = Float.parseFloat(firstOperand.getOperand())+Float.parseFloat(secondOperand.getOperand());

        }catch (RuntimeException error){
            System.out.println(error.getMessage());
        }
        return form.format(solve).toString();
    }

    public String subtract() throws RuntimeException {
        if(Float.parseFloat(firstOperand.getOperand())<0 || Float.parseFloat(secondOperand.getOperand())<0){
            throw new RuntimeException("Negative number exist");
        }
        try {
            solve = Float.parseFloat(firstOperand.getOperand())-Float.parseFloat(secondOperand.getOperand());
        }catch (RuntimeException error){
            System.out.println(error.getMessage());
        }
        return form.format(solve).toString();
    }

    public String multiply() throws RuntimeException {
        if(Float.parseFloat(firstOperand.getOperand())<0 || Float.parseFloat(secondOperand.getOperand())<0){
            throw new RuntimeException("Negative number exist");
        }
        try {
            solve = Float.parseFloat(firstOperand.getOperand())*Float.parseFloat(secondOperand.getOperand());
        }catch (RuntimeException error){
            System.out.println(error.getMessage());
        }
        return form.format(solve).toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(Float.parseFloat(firstOperand.getOperand())<0 || Float.parseFloat(secondOperand.getOperand())<0){
            throw new RuntimeException("Negative number exist");
        }
        if(Float.parseFloat(secondOperand.getOperand())== 0) throw new ArithmeticException("The operation must raise an exception");
        solve = Float.parseFloat(firstOperand.getOperand())/Float.parseFloat(secondOperand.getOperand());
        return form.format(solve).toString();
    }

    public String power() throws RuntimeException {
        if(Float.parseFloat(firstOperand.getOperand())<0 || Float.parseFloat(secondOperand.getOperand())<0){
            throw new RuntimeException("Negative number exist");
        }
        solve = Float.parseFloat(firstOperand.getOperand());
        for(int i = 1 ; i < Float.parseFloat(secondOperand.getOperand()) ; i++)
            solve = solve*Float.parseFloat(firstOperand.getOperand());
        return form.format(solve).toString();
    }

}
