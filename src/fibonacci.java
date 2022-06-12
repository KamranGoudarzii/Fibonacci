public class fibonacci {
    public static void main(String[] args) {
System.out.println(calcFib(9));
    }

    public static int calcFib(int position) {
        if (position == 0) return 0;
        if (position == 1) return 1;

        return calcFib(position- 1 ) + calcFib(position - 2);
    }
}
