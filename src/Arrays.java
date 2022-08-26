// С РАЗБОРА ДЗ НЕ ПОНЯЛА НИЧЕГО. ПРОСТО СКОПИРОВАЛА
public class Arrays {



    //объявляем массив и вызываем указанный ранее метод.
    // Метод инициализирует ваш массив и заполнит его случайными значениями
    // от 100_000 до 200_000.
    public static int[] generateRandomArray() { //генерируем рандомный массив
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        var salaries = generateRandomArray();
        int sum = 0;
        //for (int i = 0; i < salaries.length; i++) {
           // sum += salaries[i];
        for (var salary : salaries) { //каждая з/п из массива затрат
            sum += salary;
        }
        System.out.println("ЗАДАНИЕ 1");
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }
    public static void task2() {
        System.out.println();
        System.out.println("ЗАДАНИЕ 2");
        var salaries = generateRandomArray();//генерируем зарплаты

    // метод генерации  в отдельном блоке = массив нам неизвестен,
    // поэтому мы не уверены, что max з/п 200 000. Назначаем:
        int max = salaries[0]; //берем 1го попавшегося работника из массива,
        // и его з/п - это max. Возможно, это правда, а возможно и нет
        int min = salaries[0]; //берем 1го попавшегося работника из массива,
        // и его з/п - это min. Возможно, это правда, а возможно и нет

        for (int i = 0; i < salaries.length; i++) {
            // ищем максимальную з/п
            if (max < salaries[i]) {// если max меньше чем текущая з/п i, то:
                max = salaries[i]; //то теперь максимальной будет salaries [i]
            }
            // ищем минимальную з/п
            if (min > salaries[i]) {// если min больше чем текущая з/п i, то:
                min = salaries[i]; //то теперь минимальной будет salaries [i]
            }
        }
        System.out.printf ("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная суммат за день составила %d рублей", min, max);
        //заменили printLN на printF, так как нужно вывести 2 значения
        // через %d + значения ', max, 0'
    }
    public static void task3() {
        // так как мы значения в массиве не меняем, то можем обращаться не к идексу значений,
        // а к значениям, то есть воспользоваться for each
        System.out.println();
        System.out.println("ЗАДАНИЕ 2 - через each");
        var salaries = generateRandomArray();//генерируем зарплаты

        int max = salaries[0]; //берем 1го попавшегося работника из массива,
        // и его з/п - это max. Возможно, это правда, а возможно и нет
        int min = salaries[0]; //берем 1го попавшегося работника из массива,
        // и его з/п - это min. Возможно, это правда, а возможно и нет

        for (var salary : salaries) {  //каждая з/п из массива затрат
            // ищем максимальную з/п
            if (max < salary) {// если max меньше чем первая попавшаяся з/п, то:
                max = salary; //то теперь максимальной будет следующая попавшаяся
            }
            // ищем минимальную з/п
            if (min > salary) {// если min больше чем первая попавшаяся, то:
                min = salary; //то теперь минимальной будет следующая попавшаяся
            }
        }
        System.out.printf ("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная суммат за день составила %d рублей", min, max);
        //заменили printLN на printF, так как нужно внутри текста вывести 2 значения
        // через %d + значения ', max, 0'
    }
    public static void task4() {
        // какую  сумму в день компания тратит в среднем за 1 день
        System.out.println();
        System.out.println("ЗАДАНИЕ 3");

        var salaries = generateRandomArray();//генерируем зарплаты
        int sum = 0;
        for (var salary : salaries) {  //каждая з/п из массива затрат
            sum += salary; //сложить все salary в sum
        }
        var result = (float) sum / salaries.length; // поделить полученную сумму на длину массива (количество дней)
        //заменила double на float

        System.out.printf ("Средняя сумма затрат на месяц составила %.2f рублей", result); // %.2f - два знака после запятой
    }
    public static void task5() {
        //исправить баг, чтобы буквы в ФИО сотрудников выводились в правильном порядке
        System.out.println();
        System.out.println("ЗАДАНИЕ 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'}; //массив из задания
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            //(int i = reverseFullName.length - 1)  начальное значение = длина массива - 1
            // (i >=0) печатать до тех пор, пока не дойдет до 0
            // (i--) с шагом минус 1
            System.out.print(reverseFullName[i]);

        }


    }

}
