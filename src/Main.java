class Main {
    static String a;
    static String b;
    static String op;
    static int result;

    public static String calc(String input1, String input2, String input3) {
        a = input1;
        op = input2;
        b = input3;

        if (a.contains("I") || a.contains("V") || a.contains("X") || b.contains("I") || b.contains("V") || b.contains("X")) { //contains проверяет содержится ли данный символ в строке
            Roman roman = Roman.valueOf(a);
            Roman romanb = Roman.valueOf(b);

            roman.getRoman();
            romanb.getRoman();

            if (roman.getRoman() > 10 || romanb.getRoman() > 10) {
                System.out.println("Введите число не больше 10.");
            } else if (roman.getRoman() <= 0 || romanb.getRoman() <= 0) {
                System.out.println("Введите число больше 0.");
            } else {
                switch (op) {
                    case "+":
                        result = roman.getRoman() + romanb.getRoman();
                        break;
                    case "-":
                        result = roman.getRoman() - romanb.getRoman();
                        break;
                    case "*":
                        result = roman.getRoman() * romanb.getRoman();
                        break;
                    case "/":
                        result = roman.getRoman() / romanb.getRoman();
                        break;
                    default:
                        System.out.println("Введите оператор.");
                }
                if (result <= 0) {
                    System.out.println("Результат меньше 1.");
                } else {
                    Roman romanResult = Roman.values()[result]; //переводим результат инта в стринг
                    System.out.println(romanResult); //выводим результат в римских
                }
            }
        } else {
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            if (c > 10 || d > 10) {
                System.out.println("Введите число не больше 10.");
            } else if (c <= 0 || d <= 0) {
                System.out.println("Введите число больше 0.");
            } else {
                switch (op) {
                    case "+":
                        result = c + d;
                        break;
                    case "-":
                        result = c - d;
                        break;
                    case "*":
                        result = c * d;
                        break;
                    case "/":
                        result = c / d;
                        break;
                    default:
                        System.out.println("Введите оператор.");
                }
                System.out.println(result);
            }
        }
        return null;
    }
}
