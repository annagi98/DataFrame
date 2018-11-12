package df;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


class DataFrameTest {
    public DataFrame df1;

    DataFrameTest(){
        df1 = new DataFrame(new String[]{"kol1", "kol2"}, new String[]{"int", "double"});
        df1.addRow(new ArrayList<>(){{add(8); add(9.0);}});
        df1.addRow(new ArrayList<>(){{add(9); add(6.12);}});
        df1.addRow(new ArrayList<>(){{add(7); add(1.078);}});
    }

    @Test
    public void dfShouldHaveSize(){
        int expected1 = 3;
        Assert.assertEquals(expected1, df1.size());
    }

    @Test
    public void dfShouldAddAnElement(){
        IntegerValue int1 = new IntegerValue(7);
        //IntegerValue int2 = new IntegerValue(7);
        DoubleValue double1 = new DoubleValue(7.0);


        df1.addElement(int1);
        df1.addElement(double1);

        int expected_size = 4;
        Assert.assertEquals(expected_size, df1.size());
    }

}

 /*  @BeforeEach
    void setter(){
       // df1 = new DataFrame(new String[]{"kol1", "kol2"}, new String[]{"int", "double"});

    } */


//   DataFrame df4 = df1.get(new String[]{"kol1", "kol2"}, true);
//  System.out.println("rozmiar kolumny z get:"+ df4.size());