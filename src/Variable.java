public class Variable {

    private Integer Id;
    private String DataType;
    private String Name;

    public Variable(int _id, String _dataType, String _varName) {
        Id = _id;
        DataType = _dataType;
        Name = _varName;
    }

    @Override
    public String toString() {
        return Id.toString() + "Variable of type <" + DataType + "> with name <" + Name + ">";
    }
}
