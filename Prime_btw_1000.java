public class Prime_btw_1000 {
    // Prime numbers between 1 to 1000
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime numbers between 1 and 1000 are: ");
        for (i = 1; i <= 1000; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
