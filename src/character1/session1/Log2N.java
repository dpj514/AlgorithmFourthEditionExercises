package character1.session1;

// 1.1.14
public class Log2N {

    private static int lg(int num) {
        int result = 0,
                temp = 1;
        while (temp <= num) {
            temp *= 2;
            result += 1;
        }
        return result - 1;
    }

    public static void main(String[] args) {
        int testNum = 32;
        System.out.println(lg(testNum));
    }
}
