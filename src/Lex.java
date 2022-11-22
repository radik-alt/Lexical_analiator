public class Lex {

    public String lexemeType;
    public int lex;
    public String val;

    public Lex(String _lexemeType, int _lex, String _val){
        lexemeType = _lexemeType;
        lex = _lex;
        val = _val;
    }

    @Override
    public String toString() {
        return "Lex{" +
                "lexemeType='" + lexemeType + '\'' +
                ", lex=" + lex +
                ", val='" + val + '\'' +
                '}';
    }
}
