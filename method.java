class Computer {

    public void playMusic() {
        System.out.println("Music is playing");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

public class method {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String a = obj.getMeAPen(2);
        System.out.println(a);
    }

}
