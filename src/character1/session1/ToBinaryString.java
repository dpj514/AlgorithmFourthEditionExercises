package character1.session1;
// 1.1.9
public class ToBinaryString {
    public static String toBinaryString(int num) {
        String s = "";
        while (num > 0) {
            num /= 2;
            s += num % 2;
        }
        return s;
    }
    public static void main(String[] args) {
        int testNum = 58;
        System.out.println(ToBinaryString.toBinaryString(testNum));
    }
}
