
public class Cheers {
        public static void main(String[] args) {
            String cheeringInput = args[0].toUpperCase();
            int counter = Integer.parseInt(args[1]);
            String needAnChars = "AEFHILMNORSX";
            for (int i = 0; i < cheeringInput.length(); i++) {
                char c1 = cheeringInput.charAt(i);
                if (needAnChars.indexOf(c1) != -1) {
                    System.out.println("Give me an " + c1 + ": " + c1 + "!");
                } 
                else {
                    System.out.println("Give me a " + c1 + ": " + c1 + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < counter; i++) {
                System.out.println(cheeringInput + "!!!");
            }
        }
}
