public class Question3 {

    public static void main(String[] args) {

//    1.   If Statement

        int age = 12;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

//     2.  Switch Statement

        switch (age) {
            case 12:
                System.out.println("You are a child.");
                break;
            case 19:
                System.out.println("You are a teenager.");
                break;
            case 59:
                System.out.println("You are an adult.");
                break;
            case 60:
                System.out.println("You are a senior citizen.");
                break;
            default:
                System.out.println("Invalid age.");
        }

//      3.  for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//      4.  for loop

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for(int j= 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

//     5. While loop

        int i = 10;
        while (i <= 10 && i >= 1){
            System.out.println(i);
            i--;
        }
    }
}
