public class Main {
    public static void main(String[] args) {
        //Robot Rob1 = new Robot();
        //Robot Rob2 = new Robot();
        //Arena a = new Arena();
        //a.fight(Rob1, Rob2);
        //Random b = new Random();
        //System.out.println(b.nextBoolean());
        Figter F1 = new Figter("ga");
        Figter F2 = new Figter("go");
        Arena d = new Arena();
        d.fight(F1, F2);
    }
}