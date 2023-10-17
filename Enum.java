enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {

        // Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal()); // Give the value as 0,1,2,3

        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println(s + ":" + s.ordinal());
        }
    }
}