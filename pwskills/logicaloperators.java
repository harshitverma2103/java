public class logicaloperators {
    public static void main(String[] args) {
        int p = 15;
        int q = 10;
        int r = 5;

        System.out.println(p > q && p > q);
        System.out.println(p > q && p < q);

        System.out.println(r < q || p < q);
        System.out.println(p > q || q > r);
        System.out.println(p < q || q < r);

        System.out.println(!(p == q));
        System.out.println(!(p > q));
    }
}