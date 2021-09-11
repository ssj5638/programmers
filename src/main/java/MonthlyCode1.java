import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MonthlyCode1 {
    // 월간 코드 챌린지 시즌1 : 내적
    int dotProduct(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    // 3진법 뒤집기
    int numeral(int n) {
        boolean endPoint = n > 0;
        int remainder;
        StringBuilder sb = new StringBuilder();

        while (endPoint) {
            remainder = n % 3;
            n /= 3;

            sb.append(remainder);

            endPoint = n > 0;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}