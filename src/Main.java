import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int j = 0;
        int t1 = 0;
        int t2;
        int dt1 = -1;
        int dt2;
        int number;
        String str;

        Scanner scanner = new Scanner(System.in);

        number = Integer.valueOf(scanner.nextLine());
        str = scanner.nextLine();

        for (int i = 0; i < number; i++) {

            if (str.charAt(i) == '(') {
                j++;
            } else {
                j--;
            }

            if (j == 0) {
                t2 = i;

                if (dt1 == -1) {
                    dt1 = t2 - t1;
                } else {
                    dt2 = t2 - t1;
                    if (dt2 > dt1) {
                        dt1 = dt2;
                    }
                }

                t1 = i + 1;
            }
        }

        System.out.println(dt1);
    }
}
