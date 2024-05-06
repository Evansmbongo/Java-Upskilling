public class Question2 {
    public static String printNameDetails(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        String text = "Hello, my name is " + fullName + ". \n" + "There are " + firstName.length() + " letters in my " +
                "first name and " + lastName.length() + " letters in my last name.";
        return text;
    }
    public static void main(String[] args){
        System.out.println(printNameDetails("Evans", "Mbongo"));
    }

}
