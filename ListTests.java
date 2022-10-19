import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    /* @Test
    public void testFilter(){
        ContainsB uhh = new ContainsB();
        List<String> test1List = new ArrayList<>();
        test1List.add("ball");
        test1List.add("hi");
        test1List.add("bad");

        List<String> test1ListExpected = new ArrayList<>();
        test1ListExpected.add("ball");
        test1ListExpected.add("bad");
        assertEquals(test1ListExpected, ListExamples.filter(test1List, uhh));
    } */

    @Test
    public void testMerge() {
        List<String> test1List1 = new ArrayList<>();
        List<String> test1List2 = new ArrayList<>();
        List<String> test1Expected = new ArrayList<>();
        test1List1.add("aa");
        test1List1.add("ba");
        test1List1.add("cb");

        test1List2.add("ab");
        test1List2.add("bb");
        test1List2.add("ca");
        test1List2.add("da");
        test1List2.add("db");


        test1Expected.add("aa");
        test1Expected.add("ab");
        test1Expected.add("ba");
        test1Expected.add("bb");
        test1Expected.add("ca");
        test1Expected.add("cb");
        test1Expected.add("da");
        test1Expected.add("db");

        assertEquals(test1Expected, ListExamples.merge(test1List1, test1List2));
    }

    
}
