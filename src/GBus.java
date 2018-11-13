
import java.util.Scanner;

public class GBus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        int count = 0;
        while (count != cases) {
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                b[i] = s.nextInt();
            }
            int c = s.nextInt();
            int p[] = new int[c];
            for (int i = 0; i < c; i++) {
                p[i] = s.nextInt();
            }
            System.out.print("case #" + (count + 1) + ": ");
            int r[] = new int[c];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < n; j++) {
                    if (p[i] >= a[j] && p[i] <= b[j]) {
                        r[i]++;
                    }
                }
                System.out.print(r[i] + " ");
            }
            System.out.println("");
            count++;
        }
    }

}
