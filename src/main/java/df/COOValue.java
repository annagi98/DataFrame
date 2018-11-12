package df;
public class COOValue extends Value {
    private int index;
    private Value element;

    public COOValue(int newIndex, Value newElement) {
        super();
        index = newIndex;
        element = newElement;

    }


    public int getIndex(){
        return index;
    }

    @Override
    protected Object getValue() {
        return element;
    }

    @Override
    public String toString() {
        return String.format("COOValue: value %s of index %d", element, index);

    }

    @Override
    public Value add(Value sth) {
        return null;
    }

    @Override
    public Value sub(Value sth) {
        return null;
    }

    @Override
    public Value mul(Value sth) {
        return null;
    }

    @Override
    public Value div(Value sth) {
        return null;
    }

    @Override
    public Value pow(Value sth) {
        return null;
    }

    @Override
    public boolean eq(Value sth) {
        return false;
    }

    @Override
    public boolean lte(Value sth) {
        return false;
    }

    @Override
    public boolean gte(Value sth) {
        return false;
    }

    @Override
    public boolean neq(Value sth) {
        return false;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public Value create(String s) {
        return null;
    }
}
