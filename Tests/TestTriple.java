import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ares on 9/30/2016.
 */
public class TestTriple {

    @Test
    public void tripleTestMix()    {
        //given
        Triple tripleObj = new Triple(10.1, "Water Polo", 9);

        //then
        Assert.assertEquals("Wrong object", 10.1, tripleObj.getLeft());
        Assert.assertEquals("Wrong object", "Water Polo", tripleObj.getMiddle());
        Assert.assertEquals("Wrong object", 9, tripleObj.getRight());
        }

    @Test
    public void tripleTestAllDoubles(){
        //given
        Triple tripleObj = new Triple(10.232342341, 20004.48239481, 9.432);

        //then
        Assert.assertEquals("Wrong object", 10.232342341, tripleObj.getLeft());
        Assert.assertEquals("Wrong object", 20004.48239481, tripleObj.getMiddle());
        Assert.assertEquals("Wrong object", 9.432, tripleObj.getRight());
    }

    @Test
    public void tripleTestMix2(){
        //given
        Triple tripleObj = new Triple(0, 'c', "Butter");

        //then
        Assert.assertEquals("Wrong object", 0, tripleObj.getLeft());
        Assert.assertEquals("Wrong object", 'c', tripleObj.getMiddle());
        Assert.assertEquals("Wrong object", "Butter", tripleObj.getRight());
    }
}
