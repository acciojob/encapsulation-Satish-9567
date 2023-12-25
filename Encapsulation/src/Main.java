public class Main {
    public static void main(String[] args) {
        RWOnly RWOnly=new RWOnly();
        RWOnly.writeOnly("you might seen some error");
        RWOnly.readOnly();
    }
}