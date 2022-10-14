import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {

    @Test
    public void testfilterList() {
        List<String> input1 = new ArrayList<String>();
        input1.add("hello");
        input1.add("My");
        input1.add("Friend's");
        input1.add("name");
        input1.add("John");

        List<String> input2 = new ArrayList<String>();
        input2.add("hello");
        input2.add("My");
        input2.add("name");


 
        assertEquals( input2,ListExamples.filter(input1, new StringC()));   // expected values are "hello", "My", "name".
        }
    
}
