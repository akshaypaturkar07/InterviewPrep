import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysContains {
    private String[] doms;

    public ArraysContains(String[] domains) {
        this.doms = domains;
    }

    public int indexOf(String input) {
        Map<Integer, Integer> map = new HashMap<>();
        int op = -1;
        int result = 0;
        List<String> domainList = Arrays.asList(doms);
        for (int i = 0; i < domainList.size(); i++) {
            if (input.contains(domainList.get(i))) {
                int index = input.indexOf(domainList.get(i));
                result = Math.max(result, index);
                map.put(result, i);
            }
        }
        if (map.size() == 0) {
            return op;
        } else {
            op = map.get(result);
        }
        System.out.println(op + "\n");
        return op;

    }

    public static void main(String[] args) {
        String[] domains = {"google.com", "google.co.in", "gmail.co.jp", "static.google.com", "mail.google.com", "a10networks.com", "ca.gov", "mit.edu", "localhost.localdomain"};
        ArraysContains dsm = new ArraysContains(domains);
        /*test("Test#1", 0, dsm.indexOf("www.google.com"));
        test("Test#2", 3, dsm.indexOf("x.static.google.com"));
        test("Test#3", 0, dsm.indexOf("google.com"));
        test("Test#4", -1, dsm.indexOf("google.xyz"));*/
        test("Test#5", -1, dsm.indexOf("gmail.google.com"));
        test("Test#5", -1, dsm.indexOf("www.gmail.google.com"));
    }

    private static void test(String label, int expected, int actual) {
        System.out.println(label + ": " + (expected == actual ? "passed" : "failed"));
    }
}
