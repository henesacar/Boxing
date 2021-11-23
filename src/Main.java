public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Rocky",20,120,85,10);
        Fighter f2 = new Fighter("Muhammed Ali",10,100,75,50);

        Match finals = new Match(f1,f2,70,100);
        finals.run();

    }
}
