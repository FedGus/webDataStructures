import java.util.Scanner;
public class lab1 {
   public static void main(String[] args) {    
   Scanner scanner = new Scanner(System.in);
   System.out.println("Поиск, вставка и удаление элементов из массива");
   int maxSize = 100;                          // Максимальный размер массива
   HighArray arr = new HighArray(maxSize);    // Ссылка на массив и создание массива
   arr.insert(123);                          // Вставляем элемент
   arr.insert(-19);
   arr.insert(0);
   arr.insert(44);
   arr.insert(53);
   arr.display();                       // Выводим массив на экран
   
   //------------------------Поиск элемента---------------------
   System.out.println("Введите искомое число");
   Long numF = scanner.nextLong();
   if (arr.find(numF)) 
     System.out.println("Такое число есть");
   else 
     System.out.println("Такого числа нет");
   
   //------------------------Добавление элемента----------------
   System.out.println("Введите число, которое хотите добавить");
   Long numIns = scanner.nextLong();
   arr.insert(numIns);
   arr.display();
   
   //------------------------Удаление элемента------------------
   System.out.println("Введите число, которое хотите удалить");
   Long numDel = scanner.nextLong();
   if (arr.delete(numDel)) 
     System.out.println("Элемент со значением " + numDel + " удален");
   else 
     System.out.println("Число не удалено");
   arr.display();
   }
}