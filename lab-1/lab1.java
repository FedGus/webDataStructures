import java.util.Scanner;
public class lab1 {
   public static void main(String[] args) {    
   Scanner scanner = new Scanner(System.in);
   System.out.println("�����, ������� � �������� ��������� �� �������");
   int maxSize = 100;                          // ������������ ������ �������
   HighArray arr = new HighArray(maxSize);    // ������ �� ������ � �������� �������
   arr.insert(123);                          // ��������� �������
   arr.insert(-19);
   arr.insert(0);
   arr.insert(44);
   arr.insert(53);
   arr.display();                       // ������� ������ �� �����
   
   //------------------------����� ��������---------------------
   System.out.println("������� ������� �����");
   Long numF = scanner.nextLong();
   if (arr.find(numF)) 
     System.out.println("����� ����� ����");
   else 
     System.out.println("������ ����� ���");
   
   //------------------------���������� ��������----------------
   System.out.println("������� �����, ������� ������ ��������");
   Long numIns = scanner.nextLong();
   arr.insert(numIns);
   arr.display();
   
   //------------------------�������� ��������------------------
   System.out.println("������� �����, ������� ������ �������");
   Long numDel = scanner.nextLong();
   if (arr.delete(numDel)) 
     System.out.println("������� �� ��������� " + numDel + " ������");
   else 
     System.out.println("����� �� �������");
   arr.display();
   }
}