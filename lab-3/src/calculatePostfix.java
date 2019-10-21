import java.io.*;

class calculatePostfix {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while(true) {
            System.out.print("Введите постфиксное выражение: ");
            System.out.flush();
            input = getString();                                  // Ввод строки с клавиатуры
            if( input.equals("") )                               // Завершение, если нажата клавиша
                break; // [Enter]
            ParsePost aParser = new ParsePost(input);          // Создание объекта для разбора выражения
            output = aParser.doParse();                       // Обработка выражения
            System.out.println("Результат вычисления постфиксного выражения: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

