public class Main {
    public static void main(String[] args) {
        LexProcess lex = new LexProcess();
        for (Lex item: lex.lexem()) {
            System.out.println(item);
        }
    }

}