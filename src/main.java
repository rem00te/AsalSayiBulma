public class main {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            int c = 0;
            for (int s = 2; s <= i; s++) {

                if (i % s == 0) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.print(i + ",");
            }
        }
    }
}
