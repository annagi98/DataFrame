import org.junit.Assert;
import org.junit.Test;

public class FloatValueTest {
    private FloatValue float1 = new FloatValue(7.0f);
    private FloatValue float2 = new FloatValue(5.2f);
    private FloatValue float3 = new FloatValue(2000000);
    private FloatValue float4 = new FloatValue(-7845);
    private FloatValue float5 = new FloatValue(2.0f);
    private FloatValue float6 = new FloatValue(3.5f);
    private FloatValue float7 = new FloatValue(7.0f);

    @Test
    public void shouldTranslateToString(){
        String expected1 = "FloatValue{value=7.0}";
        String expected2 = "FloatValue{value=5.2}";
        String expected3 = "FloatValue{value=2000000.0}";
        String expected4 = "FloatValue{value=-7845.0}";
        Assert.assertEquals(expected1, this.float1.toString());
        Assert.assertEquals(expected2, this.float2.toString());
        Assert.assertEquals(expected3, this.float3.toString());
        Assert.assertEquals(expected4, this.float4.toString());
    }

    @Test
    public void shouldAdd(){
        FloatValue expected1 = new FloatValue(12.2f);
        FloatValue expected2 = new FloatValue(-7839.8f);
        FloatValue expected3 = new FloatValue(2000007);
        FloatValue expected4 = new FloatValue(2000007);

        Assert.assertEquals(expected1, this.float1.add(float2));
        Assert.assertEquals(expected2, this.float4.add(float2));
        Assert.assertEquals(expected3, this.float3.add(float1));
        Assert.assertEquals(expected4, this.float1.add(float3));
    }

    @Test
    public void shouldSubstract(){
        FloatValue expected1 = new FloatValue(1.8000002f);
        FloatValue expected2 = new FloatValue(-7850.2f);
        FloatValue expected3 = new FloatValue(-1.8000002f);
        FloatValue expected4 = new FloatValue(1999993);

        Assert.assertEquals(expected1, this.float1.sub(float2));
        Assert.assertEquals(expected2, this.float4.sub(float2));
        Assert.assertEquals(expected3, this.float2.sub(float1));
        Assert.assertEquals(expected4, this.float3.sub(float1));
    }

    @Test
    public void shouldMultiply(){
        FloatValue expected1 = new FloatValue(36.399998f);
        FloatValue expected2 = new FloatValue(14);
        FloatValue expected3 = new FloatValue(24.5f);
        FloatValue expected4 = new FloatValue(7.0f);

        Assert.assertEquals(expected1, this.float1.mul(float2));
        Assert.assertEquals(expected2, this.float1.mul(float5));
        Assert.assertEquals(expected3, this.float6.mul(float1));
        Assert.assertEquals(expected4, this.float5.mul(float6));
    }

    @Test
    public void shouldDivide(){
        FloatValue expected1 = new FloatValue(1.346153846153846f);
        FloatValue expected2 = new FloatValue(3.5f);
        FloatValue expected3 = new FloatValue(0.5f);
        FloatValue expected4 = new FloatValue(0.5714285714285714f);

        Assert.assertEquals(expected1, this.float1.div(float2));
        Assert.assertEquals(expected2, this.float1.div(float5));
        Assert.assertEquals(expected3, this.float6.div(float1));
        Assert.assertEquals(expected4, this.float5.div(float6));
    }

    @Test
    public void shouldRaiseToThePower(){
        FloatValue expected1 = new FloatValue(24803.31f);
        FloatValue expected2 = new FloatValue(49);
        FloatValue expected3 = new FloatValue(6433.9296875f);
        FloatValue expected4 = new FloatValue(11.313708498984761f);

        Assert.assertEquals(expected1, this.float1.pow(float2));
        Assert.assertEquals(expected2, this.float1.pow(float5));
        Assert.assertEquals(expected3, this.float6.pow(float1));
        Assert.assertEquals(expected4, this.float5.pow(float6));
    }

    @Test
    public void areValuesEqual(){
        Assert.assertTrue(this.float1.eq(float7));
        Assert.assertFalse(this.float1.eq(float5));
        Assert.assertFalse(this.float6.eq(float1));
        Assert.assertTrue(this.float7.eq(float1));
    }

    @Test
    public void areLessOrEqual(){
        Assert.assertTrue(this.float1.lte(float7));
        Assert.assertFalse(this.float1.lte(float5));
        Assert.assertTrue(this.float6.lte(float1));
        Assert.assertTrue(this.float7.lte(float1));
    }

    @Test
    public void areGreaterOrEqual(){
        Assert.assertTrue(this.float1.gte(float7));
        Assert.assertTrue(this.float1.gte(float5));
        Assert.assertFalse(this.float6.gte(float1));
        Assert.assertTrue(this.float7.gte(float1));
    }

    @Test
    public void areValuesNotEqual(){
        Assert.assertFalse(this.float1.neq(float7));
        Assert.assertTrue(this.float1.neq(float5));
        Assert.assertTrue(this.float6.neq(float1));
        Assert.assertFalse(this.float7.neq(float1));
    }

    @Test
    public void areObjectsEqual(){
        Assert.assertEquals(float1, float7);
        Assert.assertNotEquals(float1, float5);
        Assert.assertNotEquals(float1, float6);
        Assert.assertEquals(float7, float7);
    }

    @Test
    public void testHashCode(){
        int expected1 = 1075576;
        int expected2 = -2146120;

        Assert.assertEquals(expected1, float1.hashCode());
        Assert.assertEquals(expected2, float2.hashCode());
        Assert.assertEquals(float1.hashCode(), float7.hashCode()); //te same wartosci
        Assert.assertEquals(float1.hashCode(), float1.hashCode()); //te same obiekty
    }
}