package basics.factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @Test
    public void testFactorial()
    {
        Assertions.assertEquals(Solution.factorial(5), 120 );
        Assertions.assertNotNull(solution, "Not null");
    }

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
}