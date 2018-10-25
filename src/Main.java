
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        DataFrame df1= new DataFrame(new String[]{"kol1", "kol2"}, new String[]{"int", "double"});
      //  DataFrame df2= new DataFrame("data.csv", new String[]{"double", "double", "double"}, false);
      //  DataFrame df3= new DataFrame("data.csv", new String[]{"double", "double", "double"}, true);

    //    ArrayList row1 = new ArrayList<Object>()
        df1.addRow(new ArrayList<Object>(){{add(8); add(9.0);}});
        df1.addRow(new ArrayList<Object>(){{add(9); add(6.12);}});
        df1.addRow(new ArrayList<Object>(){{add(7); add(1.078);}});
      //  df1.addRow(new Object[]{9,6.12});
      //  df1.addRow(new Object[]{7,1.078});

        DataFrame df4 = df1.get(new String[]{"kol1", "kol2"}, true);
        System.out.print("rozmiar kolumny z get:"+ df4.size());
/////////////////////////////////////////////////////////////////////////////////

        Integer int1 = new Integer(5);
        String intString = int1.toString();
        System.out.print(intString);

        Integer int2 = new Integer(7);
        String intString2 = int2.toString();
        System.out.print(intString2);

        Integer sum = (Integer)int1.add(int2);
        System.out.print(sum);







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
