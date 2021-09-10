import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class monthlyCode1 {
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
        List<Integer> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        while (endPoint) {
            remainder = n % 3;
            n /= 3;

            sb.append(remainder);
            temp.add(remainder);

            endPoint = n > 0;
        }

        for (int i = 1; i <= temp.size(); i++) {
            answer += Integer.parseInt(String.valueOf(sb.charAt(temp.size() - i))) * Math.pow(3, i - 1);
        }

        return answer;
    }
}