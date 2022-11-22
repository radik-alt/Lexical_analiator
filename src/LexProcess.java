import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LexProcess {

    private LexemProcessState state = LexemProcessState.Idle;
    private List<Lex> lexeme = new ArrayList<Lex>();
    private List<Variable> _variablesTable = new ArrayList<Variable>();
    private String _buffer = "";
    private char[] _charBuffer = new char[1];
    BufferedReader _reader = null;

    String fileName = "lab.txt";
    public List<Lex> lexem(){
        try {
            _reader = new BufferedReader(new FileReader(fileName));
            StringBuilder line = new StringBuilder();
            String temp;
            while ((temp = _reader.readLine())!= null){
                line.append(temp);
            }
            System.out.println(line);
            while (state != LexemProcessState.Final){
                switch (state){
                    case Idle -> {
                        System.out.println();
                        if (_reader.readLine() == null){
                            state = LexemProcessState.Final;
                        }
                        if (IsEmptyOrNextLine(_charBuffer[0])){
                            NextChar();
                        } else if (Character.isLetter(_charBuffer[0])){
                            clearBuffer();
                            addToBuffer(_charBuffer[0]);
                            state = LexemProcessState.ReadingIdentifier;
                            NextChar();
                        } else if (Character.isDigit(_charBuffer[0])){
                            clearBuffer();
                            addToBuffer(_charBuffer[0]);
                            state = LexemProcessState.ReadingNum;
                            NextChar();
                        }else {
                            state = LexemProcessState.Delimeter;
                            addToBuffer(_charBuffer[0]);
                            NextChar();
                        }
                    }
                    case ReadingIdentifier -> {
                        if (!IsEmptyOrNextLine(_charBuffer[0])){
                            
                        } else {
                            NextChar();
                        }
                    }
                    case ReadingNum -> {
                        System.out.println(2);
                    }
                    case Delimeter -> {
                        System.out.println(1);
                    }
                    case Error -> {
                        System.out.println("Error ");
                        state = LexemProcessState.Final;
                    }
                    case Final -> {
                        System.out.println("Final");
                        return lexeme;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lexeme;
    }

    private boolean operation(char input){
        if (input == '+' || input == '-' || input == '*' || input == '/')
            return true;
        return false;
    }
    private Boolean IsEmptyOrNextLine(char input) {
        return input == ' '
                || input == '\n'
                || input == '\t'
                || input == '\0'
                || input == '\r';
    }

    private void NextChar(){
        try {
            _reader.read(_charBuffer, 0, 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void AddLexeme(String _lexemeType , int value, String lex)
    {
        lexeme.add(new Lex(_lexemeType, value, lex));
    }

    private void clearBuffer(){
        _buffer = "";
    }

    private void addToBuffer(char input){
        _buffer += input;
    }
}
