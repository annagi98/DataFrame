import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
enum DatePart{
    DAYS,
    HOURS,
    MINUTES,
    MONTHS,
    SECONDS,
    YEARS
} */

public class DateTimeValue extends Value {
    private Date value;

    public DateTimeValue(Date value) {
        this.value = value;
    }

    public DateTimeValue() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 0);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        this.value = cal.getTime();
    }


    public DateTimeValue(int year, int month, int day, int hrs, int mins, int secs) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hrs);
        cal.set(Calendar.MINUTE, mins);
        cal.set(Calendar.SECOND, secs);

        this.value = cal.getTime();

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
    /*    if ( added instanceof  DateTimeValue){
            //String old =  this.value;
            //String val = (String) added.toString();
            // return new String(this.value+ value.toString());
            return new DateTimeValue(this.value = this.value + added.toString());  //czemu to nie dziala?
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
        if (toCompare instanceof DateTimeValue) {
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
     /*   if (toCompare instanceof DateTimeValue) {
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
        if (toCompare instanceof DateTimeValue) {
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
        if (toCompare instanceof DateTimeValue) {
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

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public Value create(String s) {
        /*
        StringBuilder fourDigitSB= new StringBuilder();
        StringBuilder twoDigitSB= new StringBuilder();

        int pole =0; //moze zrobic tutaj enum?
        int fourDigitCounter = 0;
        int twoDigitCounter = 0;
        int year=0;
        int month=0;
        int day=0;
        int hrs=0;
        int mins=0;
        int secs=0;

        for (int i=0; i<4; i++) {
            fourDigitSB.append(s.charAt(i));
            System.out.println(fourDigitSB.toString());
            fourDigitCounter++;

            if(fourDigitCounter == 4){
                String yearStr = fourDigitSB.toString();
                year = Integer.parseInt(yearStr);
                System.out.println(year);
                pole++;

                break;
            }

        }
            //rok
            if(i==4 || i==7 || i==10 || i==13 | i==16){
                continue;
            }
            switch(pole){
                case 0:
                    fourDigitSB.append(s.charAt(i));
                    System.out.println(fourDigitSB.toString());
                    fourDigitCounter++;

                    if(fourDigitCounter == 4){
                        String yearStr = fourDigitSB.toString();
                        year = Integer.parseInt(yearStr);
                        System.out.println(year);
                        pole++;

                        break;
                    }
                    break;

                    //1-miesiac, 2-dzien, 3-godzina, 4-minuty, 5-sekundy
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                   // System.out.println("hiii");
                    twoDigitSB.append(s.charAt(i));
                    twoDigitCounter++;
                    if(twoDigitCounter ==2){
                        switch(pole){
                            case 1:
                                String monthStr = twoDigitSB.toString();
                                month = Integer.parseInt(monthStr);
                                System.out.println(fourDigitSB.toString());
                                pole++;
                                System.out.println("month: ");
                                System.out.println(month);
                                twoDigitSB.delete(0,2);
                                //System.out.println(pole);
                                break;
                            case 2:
                                String dayStr = twoDigitSB.toString();
                                day = Integer.parseInt(dayStr);
                                System.out.println("day: ");
                                System.out.println(day);
                                break;
                            case 3:
                                String hourStr = twoDigitSB.toString();
                                hrs = Integer.parseInt(hourStr);
                                break;
                            case 4:
                                String minsStr = twoDigitSB.toString();
                                mins = Integer.parseInt(minsStr);
                                break;
                            case 5:
                                String secsStr = twoDigitSB.toString();
                                secs = Integer.parseInt(secsStr);
                                break;
                        }
                        break;
                       // pole++;
                       // twoDigitSB.delete(0,2);
                    }
                    break;
            }
        }

        return new DateTimeValue(year, month, day, hrs, mins, secs);  */

/*
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hrs);
        cal.set(Calendar.MINUTE, mins);
        cal.set(Calendar.SECOND, secs);

        this.value = cal.getTime();*/
        return null;
    }
}

