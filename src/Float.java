import static java.lang.Math.*;
public class Float extends Value {
    private float value;

    public Float(float value) {
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
        if (added instanceof Float) {
            float val = (float) added.getValue();
            return new Float(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof Float) {
            float val = (float) subtracted.getValue();
            return new Float(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof Float) {
            float val = (float) multiplying.getValue();
            return new Float(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof Float) {
            float val = (float) dividing.getValue();
            return new Float(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof Float) {
            float val = (float) power.getValue();
            float sum = (float)Math.pow(this.value, val);
            return new Float(sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof Float) {
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
        if (toCompare instanceof Float) {
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
        if (toCompare instanceof Float) {
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
        if (toCompare instanceof Float) {
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
        return false;
    }
}
