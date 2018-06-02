package character1.session1;

import org.jetbrains.annotations.Contract;

// 1.1.9
public class ToBinaryString {
    private static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num /= 2;
            sb.append(num % 2);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int testNum = 58;
        System.out.println(ToBinaryString.toBinaryString(testNum));
    }
}
