package kurs;

/*
Привет. Сегодня суббота и задачка будет попроще. Давайте поработаем с числами? Надо написать функцию,
которая на вход получает число, состоящее из двух цифр. Например 10, 44 или 38.
Функция должна вернуть TRUE в случае, если первая цифра в числе равняется второй цифре в числе ИЛИ
если сумма первой и второй цифр равна 10. Во всех остальных случаях должен вернуться FALSE.
Примеры:
33 - TRUE
46 - TRUE
38 - FALSE
*/

public class Main {

    public static void main(String[] args) {

        System.out.printf("%d - %b\n", 33, analysisNumber(33));
        System.out.printf("%d - %b\n", 46, analysisNumber(46));
        System.out.printf("%d - %b\n", 38, analysisNumber(38));

    }

    private static boolean analysisNumber(int n) {
        int n2 = n % 10;
        int n1 = (n % 100 - n2) / 10;
        return n1 == n2 || n1 + n2 == 10;
    }
}
