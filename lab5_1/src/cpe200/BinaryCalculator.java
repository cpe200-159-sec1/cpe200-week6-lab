package cpe200;


public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        if (Integer.parseInt(firstOperand.getOperand()) < 0 || Integer.parseInt(secondOperand.getOperand()) < 0){
            throw new RuntimeException("Input can't be negative.");
        }
        try {
            String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand()));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's something.");
        }
        return null;
    }

    public String subtract() throws RuntimeException {
        if (Integer.parseInt(firstOperand.getOperand()) < 0 || Integer.parseInt(secondOperand.getOperand()) < 0){
            throw new RuntimeException("Input can't be negative.");
        }
        try {
            String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) - Double.parseDouble(secondOperand.getOperand()));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's something.");
        }
        return null;
    }

    public String multiply() throws RuntimeException {
        if (Integer.parseInt(firstOperand.getOperand()) < 0 || Integer.parseInt(secondOperand.getOperand()) < 0){
            throw new RuntimeException("Input can't be negative.");
        }
        try {
            String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand()));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's something.");
        }
        return null;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (secondOperand.getOperand().equals("0")){
            throw new ArithmeticException("Divide by zero");
        }
        if (Integer.parseInt(firstOperand.getOperand()) < 0 || Integer.parseInt(secondOperand.getOperand()) < 0){
            throw new RuntimeException("Input can't be negative.");
        }
        try {
            String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand()));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's something.");
        }
        return null;
    }

    public String power() throws RuntimeException {
        if (Integer.parseInt(firstOperand.getOperand()) < 0 || Integer.parseInt(secondOperand.getOperand()) < 0){
            throw new RuntimeException("Input can't be negative.");
        }
        try {
            String ans = String.format("%."+ 5 + "f", Math.pow(Double.parseDouble(firstOperand.getOperand()) , Double.parseDouble(secondOperand.getOperand())));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's something.");
        }
        return null;
    }

}
