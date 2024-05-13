package Week2;
public class Question2 {
    public enum Color {
        RED("C40C0C"),
        GREEN("C40C0C"),
        BLUE("0802A3"),
        YELLOW("E9B824"),
        BLACK("151515");
        String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static void main(String[] args) {
            for (Color color : Color.values()) {
                System.out.println(color + ": " + color.getCode());
            }

        }
    }
}
