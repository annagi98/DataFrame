
public class IntegerValue extends Value {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    public IntegerValue(){
        this.value=0;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        //String new_string = ;
        //new_string = String.valueOf(value);
        return "IntegerValue{value=" + String.valueOf(value) + "}";
    }

    @Override
    public Value add(Value added) {
        if (added instanceof IntegerValue) {
            int val = (int) added.getValue();
            return new IntegerValue(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof IntegerValue) {
            int val = (int) subtracted.getValue();
            return new IntegerValue(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof IntegerValue) {
            int val = (int) multiplying.getValue();
            return new IntegerValue(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof IntegerValue) {
            int val = (int) dividing.getValue();
            return new IntegerValue(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof IntegerValue) {
            int val = (int) power.getValue();
            double sum = Math.pow(this.value, val);
            return new IntegerValue((int)sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof IntegerValue) {
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
        if (toCompare instanceof IntegerValue) {
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
        if (toCompare instanceof IntegerValue) {
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
        if (toCompare instanceof IntegerValue) {
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
        if(other==null){
            return false;
        }
        if(other instanceof IntegerValue){
            IntegerValue otherIntegerValue = (IntegerValue) other;
            if (this.value == otherIntegerValue.value){
                return true; //(this==other);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(this.value);
        result = prime*result+(int)(temp ^ (temp>>>32));
        return result;
    }

    @Override
    public Value create(String s) {
        return new IntegerValue(Integer.parseInt(s));
    }

}

