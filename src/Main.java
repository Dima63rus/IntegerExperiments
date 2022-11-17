public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count_01 = 12345;
        container.count_02 = 10;
        container.count_03 = 5059191;

        int sumNumber = Main.sumDigits(container.count_01);
        System.out.println("Сумма чисел в переменной  " + container.count_01 + " = " + sumNumber);
        sumNumber = Main.sumDigits(container.count_02);
        System.out.println("Сумма чисел в переменной  " + container.count_02 + " = " + sumNumber);
        sumNumber = Main.sumDigits(container.count_03);
        System.out.println("Сумма чисел в переменной  " + container.count_03 + " = " + sumNumber);
        System.out.println("Сумма чисел в переменной дабл  " + container.count_03 + " = " + sumNumber);
    }

    public static Integer sumDigits(int ivNumber)
//    public Integer sumDigits(Integer number)
    {
        int rvSum = 0;
//            Conv Строка->число
        String lvNumberStrVar1 = Integer.toString(ivNumber);
        for (int i = 0; i < lvNumberStrVar1.length(); i++) {
//            Get Char
            char lvCurCh = lvNumberStrVar1.charAt(i);
//            Conv Char->String
            String lvCurStr = String.valueOf(lvCurCh);
//            Conv String->Int
            int lvCurInt = Integer.parseInt(lvCurStr);
//            SumCurInt
            rvSum = rvSum + lvCurInt;
        }
//        Посчитать сумму чисел в строке
        return rvSum;
    }
}
