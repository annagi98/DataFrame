package df;
public abstract class Value {
    //Object something;
    protected abstract Object getValue();

    public abstract String toString();
    public abstract Value add(Value sth);
    public abstract Value sub(Value sth);
    public abstract Value mul(Value sth);
    public abstract Value div(Value sth);
    public abstract Value pow(Value sth);
    public abstract boolean eq(Value sth);
    public abstract boolean lte(Value sth);
    public abstract boolean gte(Value sth);
    public abstract boolean neq(Value sth);
    public abstract boolean equals(Object other);
    public abstract int hashCode();
    public abstract Value create(String s);

}