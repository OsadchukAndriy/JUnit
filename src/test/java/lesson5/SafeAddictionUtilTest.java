package lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SafeAddictionUtilTest {
    private SafeAddictionUtil util = new SafeAddictionUtil();

    @Test
//    @Parameters({
//            "1, 2, 3",
//            "-10, 30, 20",
//            "15, -5, 10",
//            "-5, -10, -15"
//    })
 //   @Parameters(source = ProvideTestData.class)

    @FileParameters("src/test/resourses/Parametres.csv")
    public void whenWithAnnotationProviderParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a,b));
    }

    public Object[] parametersForWhenWithAnnotationProviderParams_thenSafeAdd(){
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{-10, 30, 20},
                new Object[]{Integer.MAX_VALUE, 2,Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -8, Integer.MIN_VALUE}

        };
    }

}