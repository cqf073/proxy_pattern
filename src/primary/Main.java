package primary;

public class Main {

    public static void main(String[] args) {
        girl g = new girl();
        g.setName("小红");
        String ss = g.getName();
        System.out.println(ss);
        persuit boy =new persuit(g);
        boy.buy_chocolate();
        boy.buy_folwers();
        boy.sent_money();
    }
}
