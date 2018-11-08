import org.junit.Assert;
import org.junit.Test;

public class DoubleValueTest {
    private DoubleValue double1 = new DoubleValue(7.0);
    private DoubleValue double2 = new DoubleValue(5.2);
    private DoubleValue double3 = new DoubleValue(2000000);
    private DoubleValue double4 = new DoubleValue(-7845);
    private DoubleValue double5 = new DoubleValue(2.0);
    private DoubleValue double6 = new DoubleValue(3.5);
    private DoubleValue double7 = new DoubleValue(7.0);


    @Test
    public void shouldTranslateToString(){
        String expected1 = "DoubleValue{value=7.0}";
        String expected2 = "DoubleValue{value=5.2}";
        String expected3 = "DoubleValue{value=2000000.0}";
        String expected4 = "DoubleValue{value=-7845.0}";
        Assert.assertEquals(expected1, this.double1.toString());
        Assert.assertEquals(expected2, this.double2.toString());
        Assert.assertEquals(expected3, this.double3.toString());
        Assert.assertEquals(expected4, this.double4.toString());
    }

    @Test
    public void shouldAdd(){
        DoubleValue expected1 = new DoubleValue(12.2);
        DoubleValue expected2 = new DoubleValue(-7839.8);
        DoubleValue expected3 = new DoubleValue(2000007);
        DoubleValue expected4 = new DoubleValue(2000007);

        Assert.assertEquals(expected1, this.double1.add(double2));
        Assert.assertEquals(expected2, this.double4.add(double2));
        Assert.assertEquals(expected3, this.double3.add(double1));
        Assert.assertEquals(expected4, this.double1.add(double3));
    }

    @Test
    public void shouldSubstract(){
        DoubleValue expected1 = new DoubleValue(1.7999999999999998);
        DoubleValue expected2 = new DoubleValue(-7850.2);
        DoubleValue expected3 = new DoubleValue(-1.7999999999999998);
        DoubleValue expected4 = new DoubleValue(1999993);

        Assert.assertEquals(expected1, this.double1.sub(double2));
        Assert.assertEquals(expected2, this.double4.sub(double2));
        Assert.assertEquals(expected3, this.double2.sub(double1));
        Assert.assertEquals(expected4, this.double3.sub(double1));
    }

    @Test
    public void shouldMultiply(){
        DoubleValue expected1 = new DoubleValue(36.4);
        DoubleValue expected2 = new DoubleValue(14);
        DoubleValue expected3 = new DoubleValue(24.5);
        DoubleValue expected4 = new DoubleValue(7.0);

        Assert.assertEquals(expected1, this.double1.mul(double2));
        Assert.assertEquals(expected2, this.double1.mul(double5));
        Assert.assertEquals(expected3, this.double6.mul(double1));
        Assert.assertEquals(expected4, this.double5.mul(double6));
    }

    @Test
    public void shouldDivide(){
        DoubleValue expected1 = new DoubleValue(1.346153846153846);
        DoubleValue expected2 = new DoubleValue(3.5);
        DoubleValue expected3 = new DoubleValue(0.5);
        DoubleValue expected4 = new DoubleValue(0.5714285714285714);

        Assert.assertEquals(expected1, this.double1.div(double2));
        Assert.assertEquals(expected2, this.double1.div(double5));
        Assert.assertEquals(expected3, this.double6.div(double1));
        Assert.assertEquals(expected4, this.double5.div(double6));
    }

    @Test
    public void shouldRaiseToThePower(){
        DoubleValue expected1 = new DoubleValue(24803.319526919644);
        DoubleValue expected2 = new DoubleValue(49);
        DoubleValue expected3 = new DoubleValue(6433.9296875);
        DoubleValue expected4 = new DoubleValue(11.313708498984761);

        Assert.assertEquals(expected1, this.double1.pow(double2));
        Assert.assertEquals(expected2, this.double1.pow(double5));
        Assert.assertEquals(expected3, this.double6.pow(double1));
        Assert.assertEquals(expected4, this.double5.pow(double6));
    }

    @Test
    public void areValuesEqual(){
        Assert.assertTrue(this.double1.eq(double7));
        Assert.assertFalse(this.double1.eq(double5));
        Assert.assertFalse(this.double6.eq(double1));
        Assert.assertTrue(this.double7.eq(double1));
    }

    @Test
    public void areLessOrEqual(){
        Assert.assertTrue(this.double1.lte(double7));
        Assert.assertFalse(this.double1.lte(double5));
        Assert.assertTrue(this.double6.lte(double1));
        Assert.assertTrue(this.double7.lte(double1));
    }

    @Test
    public void areGreaterOrEqual(){
        Assert.assertTrue(this.double1.gte(double7));
        Assert.assertTrue(this.double1.gte(double5));
        Assert.assertFalse(this.double6.gte(double1));
        Assert.assertTrue(this.double7.gte(double1));
    }

    @Test
    public void areValuesNotEqual(){
        Assert.assertFalse(this.double1.neq(double7));
        Assert.assertTrue(this.double1.neq(double5));
        Assert.assertTrue(this.double6.neq(double1));
        Assert.assertFalse(this.double7.neq(double1));
    }

    @Test
    public void areObjectsEqual(){
        Assert.assertEquals(double1, double7);
        Assert.assertNotEquals(double1, double5);
        Assert.assertNotEquals(double1, double6);
        Assert.assertEquals(double7, double7);
    }

    @Test
    public void testHashCode(){
        int expected1 = 1075576;
        int expected2 = -1932001;

        Assert.assertEquals(expected1, double1.hashCode());
        Assert.assertEquals(expected2, double2.hashCode());
        Assert.assertEquals(double1.hashCode(), double7.hashCode()); //te same wartosci
        Assert.assertEquals(double1.hashCode(), double1.hashCode()); //te same obiekty
    }
}