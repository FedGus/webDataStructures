class InsertSort {
 private long[] a;               // Ссылка на массив a
 private int nElems;            // Количество элементов в массиве
 
 //-----------------------------------------------------------
 
 public InsertSort(int max){    // Конструктор
   a = new long[max];         // Создание массива
   nElems = 0;               // Пока нет ни одного элемента
 }
 
  //-------------------------Вставка элемента------------------

 public void insert(long value){        // Вставка элемента в массив
   a[nElems] = value;                  // Собственно вставка
   nElems++;                          // Увеличение размера
 }
 
  //-------------------Вывод массива---------------------------
 
 public void display(){                   // Вывод содержимого массива
   for(int j = 0; j < nElems; j++)           // Для каждого элемента
     System.out.print(a[j] + " ");      // Вывод
   System.out.println("");
 }
 
 public void insertSort() {
   int in, out;
   
   for(out = 1; out < nElems; out++) {
     long temp = a[out];
     in = out;
     while(in > 0 && a[in-1] >= temp) {
       a[in] = a[in-1];
       --in;
     }
     a[in] = temp;
   }
 }
}
