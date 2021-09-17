import java.util.*;

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

    int[] binary(String s) {
        int c;
        int count = 0;
        int zeroCount = 0;
        StringBuilder sb = new StringBuilder();

        while (!s.equals("1")) {
            count++;
            zeroCount += s.length();

            s = s.replace("0", "");
            c = s.length();
            zeroCount -= c;

            sb = new StringBuilder();
            while (c > 0) {
                sb.append(c % 2);
                c /= 2;
            }

            s = sb.reverse().toString();
        }
        return new int[]{count, zeroCount};
    }

    int[] triangularSnail(int n) {
        int[][] matrix = new int[n][n];
        int endPoint = (n * (n + 1)) / 2;
        int x = -1, y = 0;
        int number = 1;

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                if (i % 3 == 0) {
                    ++x;
                } else if (i % 3 == 1) {
                    ++y;
                } else if (i % 3 == 2) {
                    --x;
                    --y;
                }
                matrix[x][y] = number++;
            }
        }

        int[] answer = new int[endPoint];
        int count = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[j][i] != 0) {
                    answer[count] = matrix[j][i];
                    count++;
                }
            }
        }
        return answer;
    }

    int[] sum(int[] numbers) {
        TreeSet<Integer> sumTreeSet = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumTreeSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumTreeSet.size()];
        int i = 0;
        for (int number : sumTreeSet) {
            answer[i] = number;
            i++;
        }

        return answer;
    }

}