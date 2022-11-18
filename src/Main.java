public class Main {
    public static void main(String[] args) {
        Container container = new Container();

//        Character def
        System.out.println(container.mvCh + " conv into int " + Main.sumDigits_2(container.mvCh));
//        Проверка на строчную букву
        char lvChA = 'A';
        boolean lvFlag = Character.isLowerCase(lvChA);
        System.out.println(lvChA + " - строчная? " + lvFlag);

//        Integer/String def
        int sumNumber = Main.sumDigits(container.count_01);
        System.out.println("Сумма чисел в переменной  " + container.count_01 + " = " + sumNumber);
        sumNumber = Main.sumDigits(container.count_02);
        System.out.println("Сумма чисел в переменной  " + container.count_02 + " = " + sumNumber);
        sumNumber = Main.sumDigits(container.count_03);
        System.out.println("Сумма чисел в переменной  " + container.count_03 + " = " + sumNumber);
    }

    //    Character imp
    public static int sumDigits_2(char ivCh) {
//        conv char -> int
        return Character.digit(ivCh, 16);
    }


    //    Integer/String imp
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
