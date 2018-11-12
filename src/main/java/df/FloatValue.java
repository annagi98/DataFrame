package df;
public class FloatValue extends Value {
    private float value;

    public FloatValue(float value) {
        this.value = value;
    }

    public FloatValue(){
        this.value=0.0f;
    }


    public Object getValue() {
        return value;
    }


    public String toString() {
        return "FloatValue{value=" + String.valueOf(value) + "f}";
    }


    public Value add(Value added) {
        if (added instanceof FloatValue) {
            float val = (float) added.getValue();
            return new FloatValue(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof FloatValue) {
            float val = (float) subtracted.getValue();
            return new FloatValue(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof FloatValue) {
            float val = (float) multiplying.getValue();
            return new FloatValue(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof FloatValue) {
            float val = (float) dividing.getValue();
            return new FloatValue(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof FloatValue) {
            float val = (float) power.getValue();
            float sum = (float)Math.pow(this.value, val);
            return new FloatValue(sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof FloatValue) {
            float val = (float)toCompare.getValue();
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
        if (toCompare instanceof FloatValue) {
            float val = (float)toCompare.getValue();
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
        if (toCompare instanceof FloatValue) {
            float val = (float)toCompare.getValue();
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
        if (toCompare instanceof FloatValue) {
            float val = (float)toCompare.getValue();
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
        if(other instanceof FloatValue){
            FloatValue otherFloatValue = (FloatValue) other;
            if (this.value == otherFloatValue.value){
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
        result = (prime*result+(int)(temp ^ (temp>>>32)))/1000;
        return result;
    }

    @Override
    public Value create(String s) {
        return new FloatValue(Float.parseFloat(s));
    }
}
