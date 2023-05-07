
public class Conditionals {
    public static void main(String[] args) {

        boolean bl = true;
        int i = 3;

        // if - else if - else statements
        if (bl == true) {
            System.out.println("true");
        } else if (bl == false) {
            System.out.println("false");
        } else {
            System.out.println("else");
        }

        // switch statements
        switch (i) {

            case 1:
                System.out.println(1);
                break;

            case 2:
                System.out.println(2);
                break;

            case 3:
                System.out.println(3);
                break;

            default:
                System.out.println(0);
                break;
        }
    }
}
