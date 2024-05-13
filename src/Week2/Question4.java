package Week2;

public class Question4 {
    public void divide(int num1, int num2){
        try {
            System.out.println(num1/num2);
        } catch (ArithmeticException err){
            if(num2 ==0){
                System.out.println("Not " + err.getMessage());
            }
        }

    }

    public static void main(String [] args){
        Question4 division = new Question4();
        division.divide(5,0);
    }
}
