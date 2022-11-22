import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contstants {


    public static Map<String, Map<Integer, String>> types(){
        Map<String, Map<Integer, String>> typesMap = new HashMap<>();
        typesMap.put("int", Map.of(0, "32-bit integer"));
        typesMap.put("uint", Map.of(1, "32-bit unsigned integer"));
        typesMap.put("long", Map.of(2, "64-bit integer"));
        typesMap.put("ulong", Map.of(3, "64-bit unsigned integer"));
        typesMap.put("string", Map.of(4, "string of chars"));
        return typesMap;
    }

    public static Map<String, Map<Integer, String>> operations(){
        Map<String, Map<Integer, String>> mapOperations = new HashMap<>();
        mapOperations.put("=", Map.of(0, "assign_operation"));
        mapOperations.put("+", Map.of(1, "sum_operation"));
        mapOperations.put("-", Map.of(2, "subtract_operation"));
        mapOperations.put("*", Map.of(2, "multiply_operation"));
        mapOperations.put("/", Map.of(3, "divide_operation"));
        mapOperations.put("+=", Map.of(4, "add_amount_operation"));
        mapOperations.put("-=", Map.of(5, "subtract_amount_operation"));
        mapOperations.put("==", Map.of(6, "are_equal_operation"));
        mapOperations.put(">", Map.of(8, "more_operation"));
        mapOperations.put("<", Map.of(9, "less_operation"));
        mapOperations.put("++", Map.of(10, "increment_operation"));
        mapOperations.put("--", Map.of(11, "decrement_operation"));
        mapOperations.put("%", Map.of(12, "modulo_operation"));
        return mapOperations;
    }

    public static ArrayList<String> keySymbol(){
        ArrayList<String> key = new ArrayList<String>();
        key.add(".");
        key.add(";");
        key.add(",");
        key.add("(");
        key.add(")");
        key.add("[");
        key.add("]");
        key.add("{");
        key.add("}");
        return key;
    }

    public static String keywords() {
        return "for";
    }


}
