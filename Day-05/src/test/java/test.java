import linearsearch.firstnegativenumber.FirstNegativeNumber;
import linearsearch.searchword.SearchWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void TestFirstNegativeNumber(){
        assertEquals(FirstNegativeNumber.firstNegativeNumber(new int[]{1, 2, 3, 4, 5, -1, 0, 43, -2, 3}),-1);
    }

    @Test
    public void TestSearchWord(){
        assertEquals(SearchWord.Search(new String[]{"My name is XYZ","I age is $","Search for target ends here","Your target is King","Good Day"},"King"),"Your target is King");
        assertEquals(SearchWord.Search(new String[]{"My name is XYZ","I age is $","Search for target ends here","Your target is King","Good Day"},"Nothing"),"Not Found");
    }
}
