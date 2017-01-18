package Test;

import org.junit.Test;

import static ArrayUtils.ArrayUtils.oneswappedElem;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by andre on 17/01/2017.
 */
public class TestArrayUtils {




    @Test
    public void arrayUtilsTest(){

       assertTrue( oneswappedElem(new int[]{1,2,3,4,5,7,6,7}));


    }
}
