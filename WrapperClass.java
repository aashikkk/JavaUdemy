public class WrapperClass {
    public static void main(String[] args) {

        // primitive variable
        int num = 7;

        // reference variable
        Integer num1 = new Integer(8);

        int num2 = 4;
        Integer num3 = new Integer(num2); // Boxing
        // We passing primitive into object

        int num4 = 21;
        Integer num5 = num4; // Auto boxing - Storing primtive value to object

        int num6 = num5; // Auto un-boxing - Take out the primitive value from object

        String str = "17";
        int num7 = Integer.parseInt(str); // Integer Class have lots of features

        System.out.println(num7 * 2);
    }
}
