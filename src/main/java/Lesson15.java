import java.util.Scanner;

public class Lesson15 {

    public static int lilliesCount(int days) {
        int c = 1;

        if (days < 1) {
            return 1;
        }

        //Для значений больше чем 31, происходит переполнение int
        //Поэтому для дней >31 функция возвращает 2^30 (1073741824)
        if (days > 31) {
            return 1073741824;
        }

        for (int i = 0; i < days - 1; ++i) {
            c = c * 2;
        }

        return c;
    }

    //Функция возвращает номер дня, в котором пруд будет заполнен кувшинками более чем наполовину
    public static int daysCount(int maxLillies) {
        int currentDay = 1;

        while (lilliesCount(currentDay) < maxLillies / 2) {
            ++currentDay;
        }

        return currentDay;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий день: ");
        int n = scanner.nextInt();

        int lc = lilliesCount(n);
        System.out.print("Количество кувшинок в день " + n + " составляет " + lc);

        //TBD: Неплохо бы вынести в отдельную функцию?? А точно?
	//Petya: Посмотрел, вроде бы не нужно ;-)
        if (lc % 10 == 1) {
            System.out.println(" штука");
        } else if ((lc % 10 > 2) && (lc % 10 < 5)) {
            System.out.println(" штуки");
        } else {
            System.out.println(" штук");
        }


    }

}
