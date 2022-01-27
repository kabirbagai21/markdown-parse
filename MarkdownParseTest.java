import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest{

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    
    }

    @Test
    public void test_get_links_test_file() throws IOException{

        Path fileName = Path.of("test-file.md");
        
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    @Test
    public void test_get_links_test_breakingtest1() throws IOException{

        Path fileName = Path.of("breaking_test.md");
        
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of("https://github.com/Cubified", "https:/https://ucsd-cse15l-w22.github.io/week/week3"), links);
    }
    @Test
    public void test_get_links_test_breakingtest2() throws IOException{

        Path fileName = Path.of("breaking_test_2.md");
        
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(), links);
    }

    @Test
    public void test_get_links_test_breakingtest3() throws IOException{

        Path fileName = Path.of("breaking_test_3.md");
        
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of(), links);
    }
}

