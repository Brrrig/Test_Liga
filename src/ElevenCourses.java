import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElevenCourses { // Задача про 11 блюд в столовой. Как понял блюда не повторяются, иначе бесконечность
    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество блюд");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += eatOneDay(n, i);
        }
        System.out.println(result);
    }

    static int getFactorial(int n) {// Рассчет факториала
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int eatOneDay(int n, int k) { // Расчет различны х сочетаний для n блюд всего и k блюд съединных за день
        int result = getFactorial(n) / (getFactorial(n-k) * getFactorial(k));
        return result;
    }
}
