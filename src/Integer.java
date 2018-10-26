import static java.lang.Math.*;
public class Integer extends Value {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }


    public String toString() {
        String new_string;
        new_string = String.valueOf(value);
        return new_string;
    }


    public Value add(Value added) {
        if (added instanceof Integer) {
            int val = (int) added.getValue();
            return new Integer(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof Integer) {
            int val = (int) subtracted.getValue();
            return new Integer(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof Integer) {
            int val = (int) multiplying.getValue();
            return new Integer(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof Integer) {
            int val = (int) dividing.getValue();
            return new Integer(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof Integer) {
            int val = (int) power.getValue();
            double sum = Math.pow(this.value, val);
            return new Integer((int)sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof Integer) {
            int val = (int)toCompare.getValue();
            boolean equal = false;
            if (this.value == val){
                equal = true;
            }
            return equal;
        }
        return false;
    }

    @Override
    public boolean lte(Value toCompare) {
        if (toCompare instanceof Integer) {
            int val = (int)toCompare.getValue();
            boolean lessOrEqual = false;
            if (this.value <= val){
                lessOrEqual = true;
            }
            return lessOrEqual;
        }
        return false;
    }

    @Override
    public boolean gte(Value toCompare) {
        if (toCompare instanceof Integer) {
            int val = (int)toCompare.getValue();
            boolean greaterOrEqual = false;
            if (this.value >= val){
                greaterOrEqual = true;
            }
            return greaterOrEqual;
        }
        return false;
    }

    @Override
    public boolean neq(Value toCompare) {
        if (toCompare instanceof Integer) {
            int val = (int)toCompare.getValue();
            boolean notEqual = false;
            if (this.value != val){
                notEqual = true;
            }
            return notEqual;
        }
        return false;
    }

    @Override
    public boolean equals(Object other) {
      //  boolean equal = false;
        if(this==other){
            if(other!=null){
                if(getClass()==other.getClass()){
                    Integer newOne = (Integer) other;
                    if (this.eq(newOne)){
                        return true;
                    }
                }

            }
            return false;
        }
        return false;
    }
}

