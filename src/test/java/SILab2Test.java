import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;

class SILab2Test {
    SILab2 tester = new SILab2();

    private List<String> crateList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
    RuntimeException ex;

    //Test 1
    ex = assertThrows(RuntimeException.class, () -> SILab2.function(crateList()));
    assertTrue(ex.getMessage().contains("List length should be greater than 0"));

    //Test 2
    assertEquals(crateList("1","#","#","1"),SILab2.function(crateList("0","#","#","0")));

    //Test 3
    assertEquals(crateList("1","#","2","#","1"),SILab2.function(crateList("0","#","0","#","0")));
    }

    @Test
    void multipleCondition() {
        RuntimeException ex;

        //if (i - 1 >= 0 && list.get(i - 1).equals("#"))
        //F-X
        assertEquals(crateList("0"),SILab2.function(crateList("0")));

        //T-F
        assertEquals(crateList("0","0","0"),SILab2.function(crateList("0","0","0")));
        //T-T
        assertEquals(crateList("1","#","2","#","1"),SILab2.function(crateList("0","#","0","#","0")));


        //if (i + 1 < list.size() && list.get(i + 1).equals("#"))
        //F-X
        assertEquals(crateList("0"),SILab2.function(crateList("0")));
        //T-F
        assertEquals(crateList("0","0","0"),SILab2.function(crateList("0","0","0")));
        //T-T
        assertEquals(crateList("1","#","2","#","1"),SILab2.function(crateList("0","#","0","#","0")));

    }

}