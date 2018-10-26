
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
    /*    DataFrame df1= new DataFrame(new String[]{"kol1", "kol2"}, new String[]{"int", "double"});
      //  DataFrame df2= new DataFrame("data.csv", new String[]{"double", "double", "double"}, false);
      //  DataFrame df3= new DataFrame("data.csv", new String[]{"double", "double", "double"}, true);

    //    ArrayList row1 = new ArrayList<Object>()
        df1.addRow(new ArrayList<Object>(){{add(8); add(9.0);}});
        df1.addRow(new ArrayList<Object>(){{add(9); add(6.12);}});
        df1.addRow(new ArrayList<Object>(){{add(7); add(1.078);}});
      //  df1.addRow(new Object[]{9,6.12});
      //  df1.addRow(new Object[]{7,1.078});

        DataFrame df4 = df1.get(new String[]{"kol1", "kol2"}, true);
        System.out.print("rozmiar kolumny z get:"+ df4.size());                             */
/////////////////////////////////////////////////////////////////////////////////


        Integer int1 =new Integer(7);
        String intString = int1.toString();
        System.out.print(intString);

        Integer int2 = int1;//new Integer(int1);
        String intString2 = int2.toString();
        System.out.print(intString2);

        boolean isEqual = int1.equals(int2);
        System.out.print(isEqual);


        /*
        Integer sum = (Integer)int1.add(int2);
        System.out.print(sum);

        Integer sum1 = (Integer)int1.sub(int2);
        System.out.print(sum1);

        Integer sum2 = (Integer)int1.mul(int2);
        System.out.print(sum2);

        Integer sum3 = (Integer)int1.div(int2);
        System.out.print(sum3);

        Integer sumD4 = (Integer)int1.pow(int2);
        System.out.print(sumD4);

        boolean isEqual = int1.eq(int2);
        System.out.print(isEqual);

        boolean lessOrEqual = int1.lte(int2);
        System.out.print(lessOrEqual);

        boolean greaterOrEqual = int1.gte(int2);
        System.out.print(greaterOrEqual);

        boolean notEqual = int1.neq(int2);
        System.out.print(notEqual);
        */
/////////////////////////////////////////////////////TEST DOUBLE
        /*
        Double do1 =new Double(7.5);
        String doubleString = do1.toString();
        System.out.print(doubleString);

        Double do2 = new Double(5.25);
        String doubleString2 = do2.toString();
        System.out.print(doubleString2);

        Double sumD = (Double)do1.add(do2);
        System.out.print(sumD);

        Double sumD1 = (Double)do1.sub(do2);
        System.out.print(sumD1);

        Double sumD2 = (Double)do1.mul(do2);
        System.out.print(sumD2);

        Double sumD3 = (Double)do1.div(do2);
        System.out.print(sumD3);

        Double sumD4 = (Double)do1.pow(do2);
        System.out.print(sumD4);

        boolean isEqual = do1.eq(do2);
        System.out.print(isEqual);

        boolean lessOrEqual = do1.lte(do2);
        System.out.print(lessOrEqual);

        boolean greaterOrEqual = do1.gte(do2);
        System.out.print(greaterOrEqual);

        boolean notEqual = do1.neq(do2);
        System.out.print(notEqual);
        */
////////////////////////////////////////////////////////////////////////////// TESTY FLOAT
       /* Float flo1 =new Float(7.534f);
        String floatString = flo1.toString();
        System.out.print(floatString);

        Float flo2 = new Float(5.25f);
        String floatString2 = flo2.toString();
        System.out.print(floatString2);

        Float sumD = (Float)flo1.add(flo2);
        System.out.print(sumD);

        Float sumD1 = (Float)flo1.sub(flo2);
        System.out.print(sumD1);

        Float sumD2 = (Float)flo1.mul(flo2);
        System.out.print(sumD2);

        Float sumD3 = (Float)flo1.div(flo2);
        System.out.print(sumD3);

        Float sumD4 = (Float)flo1.pow(flo2);
        System.out.print(sumD4);

        boolean isEqual = flo1.eq(flo2);
        System.out.print(isEqual);

        boolean lessOrEqual = flo1.lte(flo2);
        System.out.print(lessOrEqual);

        boolean greaterOrEqual = flo1.gte(flo2);
        System.out.print(greaterOrEqual);

        boolean notEqual = flo1.neq(flo2);
        System.out.print(notEqual);        
        */
        
////////////////////////////////////////////////////////////// TESTY STRING tez dzialaja
/*
        StringV flo1 = new StringV("cos1");
        String floatString = flo1.toString();
        System.out.print(floatString);

        StringV flo2 = new StringV("cos2");
        String floatString2 = flo2.toString();
        System.out.print(floatString2);

        StringV sumD = (StringV)flo1.add(flo2);
        System.out.print(sumD);

        StringV sumD1 = (StringV)flo1.sub(flo2);
        System.out.print(sumD1);

        StringV sumD2 = (StringV)flo1.mul(flo2);
        System.out.print(sumD2);

        StringV sumD3 = (StringV)flo1.div(flo2);
        System.out.print(sumD3);

        StringV sumD4 = (StringV)flo1.pow(flo2);
        System.out.print(sumD4);

        boolean isEqual = flo1.eq(flo2);
        System.out.print(isEqual);

        boolean lessOrEqual = flo1.lte(flo2);
        System.out.print(lessOrEqual);

        boolean greaterOrEqual = flo1.gte(flo2);
        System.out.print(greaterOrEqual);

        boolean notEqual = flo1.neq(flo2);
        System.out.print(notEqual);   */


////////////////////////////////////////////////////////////// TESTY DATAFRAME

       // String timeStamp1 = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(Calendar.getInstance().getTime());
       // System.out.print(timeStamp1+"\n");
/*
        DateTimeV flo1 = new DateTimeV(new Date());
        String floatString = flo1.toString();
        System.out.print(floatString);

        System.out.print("\n");
        String litery = "";
        for(long i=0; i<30000L; i++){
            litery += floatString;
        }

        DateTimeV flo2 = new DateTimeV(new Date());
        String floatString2 = flo2.toString();
        System.out.print(floatString2);


        DateTimeV sumD = (DateTimeV)flo1.add(flo2);
        System.out.print(sumD);

        DateTimeV sumD1 = (DateTimeV)flo1.sub(flo2);
        System.out.print(sumD1);

        DateTimeV sumD2 = (DateTimeV)flo1.mul(flo2);
        System.out.print(sumD2);

        DateTimeV sumD3 = (DateTimeV)flo1.div(flo2);
        System.out.print(sumD3);

        DateTimeV sumD4 = (DateTimeV)flo1.pow(flo2);
        System.out.print(sumD4);

        boolean isEqual = flo1.eq(flo2);
        System.out.print(isEqual);

        boolean lessOrEqual = flo1.lte(flo2);
        System.out.print(lessOrEqual);

        boolean greaterOrEqual = flo1.gte(flo2);
        System.out.print(greaterOrEqual);

        boolean notEqual = flo1.neq(flo2);
        System.out.print(notEqual);
*/


























        //tesciki do lab1
        /*DataFrame dfIloc = df1.iloc(1);
        for(int i=0; i<dfIloc.titles.length; i++){
            System.out.print(dfIloc.mainFrame.get(i));
        }

        DataFrame dfIloc2 = df1.iloc(0,2);
        for(int i=0; i<dfIloc2.titles.length; i++){
            //printuje slupki
            for(int j=0; j<dfIloc2.titles.length; j++){
                System.out.print(dfIloc2.mainFrame.get(i).get(j));
            }
        }  */



     /*   ArrayList kolumna1 = df1.get("kol1");
        for (Object elK1 : kolumna1) {
            System.out.print("\n" + elK1);
        }
        ArrayList kolumna2 = df1.get("kol2");
        for (Object elK2 : kolumna2) {
            System.out.print("\n" + elK2);
        }  */


      //  System.out.print("Hello!"+ df2.size());
      //  System.out.print("Hello!"+ df1.size());
       // System.out.print("Hello!"+ df3.size());
    }
}
