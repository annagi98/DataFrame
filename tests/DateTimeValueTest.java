import org.junit.Assert;
import org.junit.Test;

public class DateTimeValueTest {
    private DateTimeValue Date1 = new DateTimeValue(2010, 0, 23, 12, 45, 23);
    private DateTimeValue Date2 = new DateTimeValue(2012, 3, 3, 4, 56, 45);
    /*private DateTimeValue Date3 = new DateTimeValue(2000000);
    private DateTimeValue Date4 = new DateTimeValue(-7845);
    private DateTimeValue Date5 = new DateTimeValue(2.0f);
    private DateTimeValue Date6 = new DateTimeValue(3.5f);
    private DateTimeValue Date7 = new DateTimeValue(7.0f); */

    @Test
    public void shouldTranslateToString(){
        String expected1 = "2010.01.23_12:45:23"; //miesiace liczymy od 0
        String expected2 = "2012.04.03_04:56:45";
        /*String expected3 = "DateTimeValue{value=2000000.0}";
        String expected4 = "DateTimeValue{value=-7845.0}";*/
        Assert.assertEquals(expected1, this.Date1.toString());
        Assert.assertEquals(expected2, this.Date2.toString());
       /* Assert.assertEquals(expected3, this.Date3.toString());
        Assert.assertEquals(expected4, this.Date4.toString()); */
    }
/*
    @Test
    public void shouldAdd(){
        DateTimeValue expected1 = new DateTimeValue(12.2f);
        DateTimeValue expected2 = new DateTimeValue(-7839.8f);
        DateTimeValue expected3 = new DateTimeValue(2000007);
        DateTimeValue expected4 = new DateTimeValue(2000007);

        Assert.assertEquals(expected1, this.Date1.add(Date2));
        Assert.assertEquals(expected2, this.Date4.add(Date2));
        Assert.assertEquals(expected3, this.Date3.add(Date1));
        Assert.assertEquals(expected4, this.Date1.add(Date3));
    }

    @Test
    public void shouldSubstract(){
        DateTimeValue expected1 = new DateTimeValue(1.8000002f);
        DateTimeValue expected2 = new DateTimeValue(-7850.2f);
        DateTimeValue expected3 = new DateTimeValue(-1.8000002f);
        DateTimeValue expected4 = new DateTimeValue(1999993);

        Assert.assertEquals(expected1, this.Date1.sub(Date2));
        Assert.assertEquals(expected2, this.Date4.sub(Date2));
        Assert.assertEquals(expected3, this.Date2.sub(Date1));
        Assert.assertEquals(expected4, this.Date3.sub(Date1));
    }

    @Test
    public void shouldMultiply(){
        DateTimeValue expected1 = new DateTimeValue(36.399998f);
        DateTimeValue expected2 = new DateTimeValue(14);
        DateTimeValue expected3 = new DateTimeValue(24.5f);
        DateTimeValue expected4 = new DateTimeValue(7.0f);

        Assert.assertEquals(expected1, this.Date1.mul(Date2));
        Assert.assertEquals(expected2, this.Date1.mul(Date5));
        Assert.assertEquals(expected3, this.Date6.mul(Date1));
        Assert.assertEquals(expected4, this.Date5.mul(Date6));
    }

    @Test
    public void shouldDivide(){
        DateTimeValue expected1 = new DateTimeValue(1.346153846153846f);
        DateTimeValue expected2 = new DateTimeValue(3.5f);
        DateTimeValue expected3 = new DateTimeValue(0.5f);
        DateTimeValue expected4 = new DateTimeValue(0.5714285714285714f);

        Assert.assertEquals(expected1, this.Date1.div(Date2));
        Assert.assertEquals(expected2, this.Date1.div(Date5));
        Assert.assertEquals(expected3, this.Date6.div(Date1));
        Assert.assertEquals(expected4, this.Date5.div(Date6));
    }

    @Test
    public void shouldRaiseToThePower(){
        DateTimeValue expected1 = new DateTimeValue(24803.31f);
        DateTimeValue expected2 = new DateTimeValue(49);
        DateTimeValue expected3 = new DateTimeValue(6433.9296875f);
        DateTimeValue expected4 = new DateTimeValue(11.313708498984761f);

        Assert.assertEquals(expected1, this.Date1.pow(Date2));
        Assert.assertEquals(expected2, this.Date1.pow(Date5));
        Assert.assertEquals(expected3, this.Date6.pow(Date1));
        Assert.assertEquals(expected4, this.Date5.pow(Date6));
    }

    @Test
    public void areValuesEqual(){
        Assert.assertTrue(this.Date1.eq(Date7));
        Assert.assertFalse(this.Date1.eq(Date5));
        Assert.assertFalse(this.Date6.eq(Date1));
        Assert.assertTrue(this.Date7.eq(Date1));
    }

    @Test
    public void areLessOrEqual(){
        Assert.assertTrue(this.Date1.lte(Date7));
        Assert.assertFalse(this.Date1.lte(Date5));
        Assert.assertTrue(this.Date6.lte(Date1));
        Assert.assertTrue(this.Date7.lte(Date1));
    }

    @Test
    public void areGreaterOrEqual(){
        Assert.assertTrue(this.Date1.gte(Date7));
        Assert.assertTrue(this.Date1.gte(Date5));
        Assert.assertFalse(this.Date6.gte(Date1));
        Assert.assertTrue(this.Date7.gte(Date1));
    }

    @Test
    public void areValuesNotEqual(){
        Assert.assertFalse(this.Date1.neq(Date7));
        Assert.assertTrue(this.Date1.neq(Date5));
        Assert.assertTrue(this.Date6.neq(Date1));
        Assert.assertFalse(this.Date7.neq(Date1));
    }

    @Test
    public void areObjectsEqual(){
        Assert.assertEquals(Date1, Date7);
        Assert.assertNotEquals(Date1, Date5);
        Assert.assertNotEquals(Date1, Date6);
        Assert.assertEquals(Date7, Date7);
    }

    @Test
    public void testHashCode(){
        int expected1 = 1075576;
        int expected2 = -2146120;

        Assert.assertEquals(expected1, Date1.hashCode());
        Assert.assertEquals(expected2, Date2.hashCode());
        Assert.assertEquals(Date1.hashCode(), Date7.hashCode()); //te same wartosci
        Assert.assertEquals(Date1.hashCode(), Date1.hashCode()); //te same obiekty
    } */
}