import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * {"abcden","xyzen","xyzen","cdef","defg"}
 *  123.256.245.265
 *       +
 *      + +
 *      + + +
 */

public class ListSample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abcden","xyzen","xyzen","cdef","defg");
        List<String> filteredList = stringList.stream().filter(e->e.endsWith("en")).collect(Collectors.toList());
        List<String> nonDupsList = filteredList.stream().distinct().collect(Collectors.toList());
        List<String> uppercaseList = nonDupsList.stream().map(e-> e.toUpperCase()).collect(Collectors.toList());
    }
}
