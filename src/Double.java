import static java.lang.Math.*;
public class Double extends Value {
    private double value;

    public Double(double value) {
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
        if (added instanceof Double) {
            double val = (double) added.getValue();
            return new Double(this.value + val);
        }
        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        if (subtracted instanceof Double) {
            double val = (double) subtracted.getValue();
            return new Double(this.value - val);
        }
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        if (multiplying instanceof Double) {
            double val = (double) multiplying.getValue();
            return new Double(this.value * val);
        }
        return null;
    }

    @Override
    public Value div(Value dividing) {
        if (dividing instanceof Double) {
            double val = (double) dividing.getValue();
            return new Double(this.value / val);
        }
        return null;
    }

    @Override
    public Value pow(Value power) {
        if (power instanceof Double) {
            double val = (double) power.getValue();
            double sum = Math.pow(this.value, val);
            return new Double((double)sum);
        }
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof Double) {
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
        if (toCompare instanceof Double) {
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
        if (toCompare instanceof Double) {
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
        if (toCompare instanceof Double) {
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
        return false;
    }
}

