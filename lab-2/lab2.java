public class lab2 {
   public static void main(String[] args) {    
     int maxSize = 2500;
     
     System.out.println("���������� ������� ������� ������");
     //���������� �������
     SelectSort arr;
     arr = new SelectSort(maxSize);
     
     for (int i = 0; i < maxSize; i++) {
       int x = (int)(Math.random()*((1000-0)+1))+0;
       arr.insert(x);
     }
     
     //arr.display();
     Long start = System.currentTimeMillis();
     arr.selectSort();
     Long end = System.currentTimeMillis();
     Long allTime = end - start;
     System.out.println("����� ����������� �� ���������� ������� ������: " + allTime + " ����������");
     //arr.display();
     
     System.out.println("���������� ������� ������� �������");
     //���������� ���������
     InsertSort arr2;
     arr2 = new InsertSort(maxSize);
     
     for (int i = 0; i < maxSize; i++) {
       int x = (int)(Math.random()*((100-0)+1))+0;
       arr2.insert(x);
     }
     
     //arr.display();
     Long start2 = System.currentTimeMillis();
     arr2.insertSort();
     Long end2 = System.currentTimeMillis();
     Long allTime2 = end2 - start2;
     System.out.println("����� ����������� �� ���������� ������� �������: " + allTime2 + " ����������");
     //arr.display();
   }
}