public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aashik");
        sb.append("Shihaab");

        sb.insert(0, "Java");
        sb.setLength(100);
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
    }
}
