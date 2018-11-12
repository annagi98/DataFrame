package df;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
       /* String s1 = "7";
        IntegerValue int1 = new IntegerValue();
        IntegerValue int2 = (IntegerValue)int1.create(s1);
        System.out.println(int2);

        String s2 = "7";
        DoubleValue double1 = new DoubleValue();
        DoubleValue double2 = (DoubleValue)double1.create(s2);
        System.out.println(double2);

        String s3 = "7.0f";
        FloatValue float1 = new FloatValue();
        FloatValue float2 = (FloatValue)float1.create(s3);
        System.out.println(float2);

        String s4 = "something";
        StringValue str1 = new StringValue();
        StringValue str2 = (StringValue)str1.create(s4);
        System.out.println(str2);

        String s5 = "2018.02.08_23:43:23";
        DateTimeValue dt1 = new DateTimeValue();
        DateTimeValue dt2 = (DateTimeValue)dt1.create(s5);
        System.out.println(dt2);*/


       //------------------------------SPARSE DATA FRAME TESTS---------------------------
        DataFrame df1 = new DataFrame(new String[]{"kol1"}, new String[]{"int"});


         IntegerValue int1 = new IntegerValue(0);
         IntegerValue int2 = new IntegerValue(5);
         IntegerValue int3 = new IntegerValue(0);
         IntegerValue int4 = new IntegerValue(0);
         IntegerValue int5 = new IntegerValue(2);
         IntegerValue int6 = new IntegerValue(0);
         IntegerValue int7 = new IntegerValue(0);

        df1.addRow(new ArrayList<>(){{add(int1);}});
        df1.addRow(new ArrayList<>(){{add(int2);}});
        df1.addRow(new ArrayList<>(){{add(int3);}});
        df1.addRow(new ArrayList<>(){{add(int4);}});
        df1.addRow(new ArrayList<>(){{add(int5);}});
        df1.addRow(new ArrayList<>(){{add(int6);}});
        df1.addRow(new ArrayList<>(){{add(int7);}});

       /* df1.addRow(new ArrayList<>(){{add(8);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(7);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(1);}});
        df1.addRow(new ArrayList<>(){{add(0);}});
        df1.addRow(new ArrayList<>(){{add(0);}}); */

        //System.out.println(df1.size());

        SparseDataFrame spdf1 = new SparseDataFrame(df1);
       // System.out.println(spdf1.size());

        DataFrame df2 = spdf1.toDense();
        //System.out.println(df2.mainFrame.get(0).get(0));
        System.out.println(df2.size());



       //---------------------COOValue tests!----------------------
    /*    IntegerValue int1 = new IntegerValue(7);
        IntegerValue int2 = new IntegerValue(5);
        COOValue cooV1 = new COOValue(1, int1);
        COOValue cooV2 = new COOValue(3, int2);

        String exp1 = "blablab";
        String exp2 = "sialalla";

        System.out.println(cooV1.toString());
        System.out.println(cooV2.toString());             */
       //koniec COOValue test--------------------------------
        //------------------------------koniec sparseDataFrameTest----------------------------

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

/*
        IntegerValue int1 =new IntegerValue(7);
        String intString = int1.toString();
        System.out.print(intString);

        IntegerValue int2 = int1;//new IntegerValue(int1);
        String intString2 = int2.toString();
        System.out.print(intString2);

        boolean isEqual = int1.equals(int2);
        System.out.print(isEqual);
*/


        
////////////////////////////////////////////////////////////// TESTY STRING tez dzialaja
/*
        StringValue flo1 = new StringValue("cos1");
        String floatString = flo1.toString();
        System.out.print(floatString);

        StringValue flo2 = new StringValue("cos2");
        String floatString2 = flo2.toString();
        System.out.print(floatString2);

        StringValue sumD = (StringValue)flo1.add(flo2);
        System.out.print(sumD);

        StringValue sumD1 = (StringValue)flo1.sub(flo2);
        System.out.print(sumD1);

        StringValue sumD2 = (StringValue)flo1.mul(flo2);
        System.out.print(sumD2);

        StringValue sumD3 = (StringValue)flo1.div(flo2);
        System.out.print(sumD3);

        StringValue sumD4 = (StringValue)flo1.pow(flo2);
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
        DateTimeValue flo1 = new DateTimeValue(new Date());
        String floatString = flo1.toString();
        System.out.print(floatString);

        System.out.print("\n");          //opoznienie kolejnej daty
        String litery = "";
        for(long i=0; i<30000L; i++){
            litery += floatString;
        }

        DateTimeValue flo2 = new DateTimeValue(new Date());
        String floatString2 = flo2.toString();
        System.out.print(floatString2);


        DateTimeValue sumD = (DateTimeValue)flo1.add(flo2);
        System.out.print(sumD);

        DateTimeValue sumD1 = (DateTimeValue)flo1.sub(flo2);
        System.out.print(sumD1);

        DateTimeValue sumD2 = (DateTimeValue)flo1.mul(flo2);
        System.out.print(sumD2);

        DateTimeValue sumD3 = (DateTimeValue)flo1.div(flo2);
        System.out.print(sumD3);

        DateTimeValue sumD4 = (DateTimeValue)flo1.pow(flo2);
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
