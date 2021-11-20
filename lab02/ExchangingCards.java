import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.io.BufferedReader;

public class ExchangingCards {

    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str;
        int carta1, carta2;
        while (!(str = in.readLine()).equals("0 0")) {
            Set<String> array1 = new HashSet<>(Arrays.asList(in.readLine().split("\\s")));
            Set<String> array2 = new HashSet<>(Arrays.asList(in.readLine().split("\\s")));
            carta1 = 0;
            carta2 = 0;
            for (Iterator<String> iterator = array1.iterator(); iterator.hasNext();) {
                String a = iterator.next();
                carta1 += (!array2.contains(a) ? 1 : 0);
            }
            for (Iterator<String> iterator = array2.iterator(); iterator.hasNext();) {
                carta2 += (!array1.contains(iterator.next()) ? 1 : 0);
            }
            out.println(carta1 > carta2 ? carta2 : carta1);
        }
        out.close();
    }

}