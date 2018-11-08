public class StringValue extends Value {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    public StringValue() {
        this.value = "";
    }

    public Object getValue() {
        return value;
    }


    public String toString() {
        return "StringValue{value=" + String.valueOf(value) + "}";
       /* String new_string = value;
        return new_string;*/
    }


    public Value add(Value added) {

        if ( added instanceof StringValue){
            //String old =  this.value;
            //String val = (String) added.toString();
           // return new String(this.value+ value.toString());
            return new StringValue(this.value = this.value + added.toString());  //czemu to nie dziala?
         //   return old;

        }
/*
        if (added instanceof String) {
            String thisOne = this.value;
            String val = (String) added.getValue();
            //return new String(this.value + val);
            return thisOne.append(val);
        }  */
        System.out.print("Arguments cannot be added.");

        return null;
    }

    @Override
    public Value sub(Value subtracted) {
        System.out.print("Arguments cannot be subtracted.");
        return null;
    }

    @Override
    public Value mul(Value multiplying) {
        System.out.print("Arguments cannot be multiplied.");
        return null;
    }

    @Override
    public Value div(Value dividing) {
        System.out.print("Arguments cannot be divided.");
        return null;
    }

    @Override
    public Value pow(Value power) {
        System.out.print("Arguments cannot be powered.");
        return null;
    }

    @Override
    public boolean eq(Value toCompare) {
        if (toCompare instanceof StringValue) {
            String val = toCompare.toString();
            boolean equal = false;
            if (this.value.equals(val)){
                equal = true;
            }
            return equal;
        }
        return false;
    }

    @Override
    public boolean lte(Value toCompare) {
        System.out.print("I can only compare the length of 2 strings.");
        if (toCompare instanceof StringValue) {
            String val = toCompare.toString();
            boolean lessOrEqual = false;
            if (this.value.length() <= val.length()){
                lessOrEqual = true;
            }
            return lessOrEqual;
        }
        return false;
    }

    @Override
    public boolean gte(Value toCompare) {
        System.out.print("I can only compare the length of 2 strings.");
        if (toCompare instanceof StringValue) {
            String val = toCompare.toString();
            boolean greaterOrEqual = false;
            if (this.value.length() >= val.length()){
                greaterOrEqual = true;
            }
            return greaterOrEqual;
        }
        return false;
    }

    @Override
    public boolean neq(Value toCompare) {
        if (toCompare instanceof StringValue) {
            String val = toCompare.toString();
            boolean notEqual = false;
            if (!this.value.equals(val)){
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

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public Value create(String s) {
        return new StringValue(s);
    }
}

