package encapsulation;

public class main {
    public static void main(String[] args) {
        encapsulation data = new encapsulation(1,2,3);
        System.out.println(data);

        data.setHeight(31);
        System.out.println(data.getHeight());
    }
}
