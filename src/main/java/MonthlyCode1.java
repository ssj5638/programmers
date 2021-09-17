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
        int endPoint = n % 2 == 0 ? (n + 1) * (n / 2) : (n + 1) * (n / 2) + ((n / 2) + 1);
        int number = 1;
        int x = 0;
        int y = -1;
        boolean turnDown = true;
        boolean turnLeft = false;
        boolean turnUp = false;

        while (endPoint >= number) {
            if (turnDown) {
                for (int j = y + 1; j < n; j++) {
                    matrix[j][x] = number;
                    number++;
                    if (endPoint < number) {
                        turnDown = false;
                        break;
                    }
                    if (j == n - 1 || matrix[j + 1][x] != 0) {
                        turnDown = false;
                        turnLeft = true;
                        y = j;
                        break;
                    }
                }
            }

            if (turnLeft) {
                for (int i = x + 1; i < n; i++) {
                    matrix[y][i] = number;
                    number++;
                    if (endPoint < number) {
                        turnLeft = false;
                        break;
                    }
                    if (i == n - 1 || matrix[y][i + 1] != 0) {
                        turnLeft = false;
                        turnUp = true;
                        x = i;
                        break;
                    }
                }
            }

            if (turnUp) {
                while (matrix[y - 1][x - 1] == 0) {
                    x--;
                    y--;
                    matrix[y][x] = number;
                    number++;
                }
                turnUp = false;
                turnDown = true;
                if (endPoint < number) {
                    turnDown = false;
                }
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

}