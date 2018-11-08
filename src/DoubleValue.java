public class DoubleValue extends Value {
    private double value;

    public DoubleValue(double value) {
        this.value = value;
    }
    public DoubleValue(){
        this.value=0.0;
    }

    public Object getValue() {
        return value;
    }


    public String toString() {
        return "DoubleValue{value=" + String.valueOf(value) + "}";
    }


    public Value add(Value added) {
        if (added instanceof DoubleValue) {
            double val = (double) added.getValue();
            return new DoubleValue(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof DoubleValue) {
            double val = (double) subtracted.getValue();
            return new DoubleValue(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof DoubleValue) {
            double val = (double) multiplying.getValue();
            return new DoubleValue(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof DoubleValue) {
            double val = (double) dividing.getValue();
            return new DoubleValue(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof DoubleValue) {
            double val = (double) power.getValue();
            double sum = Math.pow(this.value, val);
            return new DoubleValue((double)sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof DoubleValue) {
            double val = (double)toCompare.getValue();
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
        if (toCompare instanceof DoubleValue) {
            double val = (double)toCompare.getValue();
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
        if (toCompare instanceof DoubleValue) {
            double val = (double)toCompare.getValue();
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
        if (toCompare instanceof DoubleValue) {
            double val = (double)toCompare.getValue();
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
        if(other instanceof DoubleValue){
            DoubleValue otherDoubleValue = (DoubleValue) other;
            if (this.value == otherDoubleValue.value){
                return true; //(this==other); - wtedy porownywalibysmy tez referencje
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
        result = (prime*result+(int)(temp ^ (temp>>>32)))/1000;
        return result;
    }

    @Override
    public Value create(String s) {
        return new DoubleValue(Double.parseDouble(s));
    }
}

