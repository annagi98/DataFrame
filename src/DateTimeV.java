import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeV extends Value {
    private Date value;

    public DateTimeV(Date value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss");
        String date = sdf.format(this.value);
        return date;
    }


    public Value add(Value added) {
      System.out.print("Arguments cannot be added.");
        return null;
    /*    if ( added instanceof  DateTimeV){
            //String old =  this.value;
            //String val = (String) added.toString();
            // return new String(this.value+ value.toString());
            return new DateTimeV(this.value = this.value + added.toString());  //czemu to nie dziala?
            //   return old;

        } */

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
        if (toCompare instanceof DateTimeV) {
            String thisOne = this.value.toString();
            String val = toCompare.toString();
            boolean equal = false;
            if (thisOne.equals(val)){
                equal = true;
            }
            return equal;
        }
        return false;
    }

    @Override
    public boolean lte(Value toCompare) {
        System.out.print("I can compare time.");   //dopisac ta metode poprawnie!
     /*   if (toCompare instanceof DateTimeV) {
            String thisOne = this.value.toString();
            String val = toCompare.toString();


            boolean lessOrEqual = false;
            if (this.value.length() <= val.length()){
                lessOrEqual = true;
            }
            return lessOrEqual;
        }
        return false; */
        return false;
    }

    @Override
    public boolean gte(Value toCompare) {
        System.out.print("I can compare time.");     //dopisac analogicznie
       /*
        if (toCompare instanceof DateTimeV) {
            String val = toCompare.toString();
            boolean greaterOrEqual = false;
            if (this.value.length() >= val.length()){
                greaterOrEqual = true;
            }
            return greaterOrEqual;
        } */
        return false;
    }

    @Override
    public boolean neq(Value toCompare) {
        if (toCompare instanceof DateTimeV) {
            String thisOne = this.value.toString();
            String val = toCompare.toString();
            boolean notEqual = false;
            if (thisOne.equals(val)){
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

