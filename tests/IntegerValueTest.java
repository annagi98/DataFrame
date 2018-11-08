import org.junit.Assert;
import org.junit.Test;

public class IntegerValueTest {

    private IntegerValue int1 = new IntegerValue(7);
    private IntegerValue int2 = new IntegerValue(5);
    private IntegerValue int3 = new IntegerValue(2000000);
    private IntegerValue int4 = new IntegerValue(7845);
    private IntegerValue int5 = new IntegerValue(2);
    private IntegerValue int6 = new IntegerValue(3);
    private IntegerValue int7 = new IntegerValue(7);

    @Test
    public void shouldTranslateToString(){
        String expected1 = "IntegerValue{value=7}";
        String expected2 = "IntegerValue{value=5}";
        String expected3 = "IntegerValue{value=2000000}";
        String expected4 = "IntegerValue{value=7845}";
        Assert.assertEquals(expected1, this.int1.toString());
        Assert.assertEquals(expected2, this.int2.toString());
        Assert.assertEquals(expected3, this.int3.toString());
        Assert.assertEquals(expected4, this.int4.toString());
    }

    @Test
    public void shouldAdd(){
        IntegerValue expected1 = new IntegerValue(12);
        IntegerValue expected2 = new IntegerValue(7850);
        IntegerValue expected3 = new IntegerValue(2000007);
        IntegerValue expected4 = new IntegerValue(2000007);

        Assert.assertEquals(expected1, this.int1.add(int2));
        Assert.assertEquals(expected2, this.int4.add(int2));
        Assert.assertEquals(expected3, this.int3.add(int1));
        Assert.assertEquals(expected4, this.int1.add(int3));
    }

    @Test
    public void shouldSubstract(){
        IntegerValue expected1 = new IntegerValue(2);
        IntegerValue expected2 = new IntegerValue(7840);
        IntegerValue expected3 = new IntegerValue(-2);
        IntegerValue expected4 = new IntegerValue(1999993);

        Assert.assertEquals(expected1, this.int1.sub(int2));
        Assert.assertEquals(expected2, this.int4.sub(int2));
        Assert.assertEquals(expected3, this.int2.sub(int1));
        Assert.assertEquals(expected4, this.int3.sub(int1));
    }

    @Test
    public void shouldMultiply(){
        IntegerValue expected1 = new IntegerValue(35);
        IntegerValue expected2 = new IntegerValue(14);
        IntegerValue expected3 = new IntegerValue(21);
        IntegerValue expected4 = new IntegerValue(6);

        Assert.assertEquals(expected1, this.int1.mul(int2));
        Assert.assertEquals(expected2, this.int1.mul(int5));
        Assert.assertEquals(expected3, this.int6.mul(int1));
        Assert.assertEquals(expected4, this.int5.mul(int6));
    }

    @Test
    public void shouldDivide(){
        IntegerValue expected1 = new IntegerValue(1);
        IntegerValue expected2 = new IntegerValue(3);
        IntegerValue expected3 = new IntegerValue(0);
        IntegerValue expected4 = new IntegerValue(0);

        Assert.assertEquals(expected1, this.int1.div(int2));
        Assert.assertEquals(expected2, this.int1.div(int5));
        Assert.assertEquals(expected3, this.int6.div(int1));
        Assert.assertEquals(expected4, this.int5.div(int6));
    }

    @Test
    public void shouldRaiseToThePower(){
        IntegerValue expected1 = new IntegerValue(16807);
        IntegerValue expected2 = new IntegerValue(49);
        IntegerValue expected3 = new IntegerValue(2187);
        IntegerValue expected4 = new IntegerValue(8);

        Assert.assertEquals(expected1, this.int1.pow(int2));
        Assert.assertEquals(expected2, this.int1.pow(int5));
        Assert.assertEquals(expected3, this.int6.pow(int1));
        Assert.assertEquals(expected4, this.int5.pow(int6));
    }

    @Test
    public void areValuesEqual(){
        Assert.assertTrue(this.int1.eq(int7));
        Assert.assertFalse(this.int1.eq(int5));
        Assert.assertFalse(this.int6.eq(int1));
        Assert.assertTrue(this.int7.eq(int1));
    }

    @Test
    public void areLessOrEqual(){
        Assert.assertTrue(this.int1.lte(int7));
        Assert.assertFalse(this.int1.lte(int5));
        Assert.assertTrue(this.int6.lte(int1));
        Assert.assertTrue(this.int7.lte(int1));
    }

    @Test
    public void areGreaterOrEqual(){
        Assert.assertTrue(this.int1.gte(int7));
        Assert.assertTrue(this.int1.gte(int5));
        Assert.assertFalse(this.int6.gte(int1));
        Assert.assertTrue(this.int7.gte(int1));
    }

    @Test
    public void areValuesNotEqual(){
        Assert.assertFalse(this.int1.neq(int7));
        Assert.assertTrue(this.int1.neq(int5));
        Assert.assertTrue(this.int6.neq(int1));
        Assert.assertFalse(this.int7.neq(int1));
    }

    @Test
    public void areObjectsEqual(){
        Assert.assertEquals(int1, int7);
        Assert.assertNotEquals(int1, int5);
        Assert.assertNotEquals(int1, int6);
        Assert.assertEquals(int7, int7);
    }
    
    @Test
    public void testHashCode(){
        int expected1 = 1075576863;
        int expected2 = 1075052575;

        Assert.assertEquals(expected1, int1.hashCode());
        Assert.assertEquals(expected2, int2.hashCode());
        Assert.assertEquals(int1.hashCode(), int7.hashCode()); //te same wartosci
        Assert.assertEquals(int1.hashCode(), int1.hashCode()); //te same obiekty
    }

/*    @Test
    public void shouldCreate(){
        String create1 = "7";
        Assert.assertEquals(int1, create(create1));
    } */
}