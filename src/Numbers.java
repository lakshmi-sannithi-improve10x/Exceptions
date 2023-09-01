public class Numbers {
    public static void main(String[] args) {
        System.out.println(convertToInt("1"));
        System.out.println(convertToInt("4"));
        System.out.println(convertToInt("5"));
        System.out.println(convertToInt("6"));
        System.out.println(convertToInt("10"));
        System.out.println(convertToInt("hai"));
        System.out.println(convertToInt("2"));
        System.out.println(convertToInt("-2"));
    }

    public static int convertToInt(String text) {
        try {
            int num = Integer.parseInt(text);
            int quotient = 100/num;
            int multiplication = 5 * num;
            int subtraction = 50 - num;
            return subtraction;
        }catch (NumberFormatException ex){
            System.out.println("Invalid Number");
        }catch (ArithmeticException e){
            System.out.println("Division by zero is invalid");
            System.out.println("Multiply by zero is invalid" + e.getMessage());
            System.out.println("subtraction is invalid" + e.getMessage());
        } catch (Exception exception){
            System.out.println("Invalid");
        }finally {
            System.out.println("finally");
        }
        return -1;
    }
}