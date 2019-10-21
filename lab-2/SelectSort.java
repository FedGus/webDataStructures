class SelectSort {
 private long[] a;               // Ссылка на массив a
 private int nElems;            // Количество элементов в массиве
 
 //-----------------------------------------------------------
 
 public SelectSort(int max){    // Конструктор
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
 
 public void selectSort() {
   int out, in, min;
   for(out = 0; out < nElems-1; out++){
     min = out;
     for(in = out+1; in < nElems; in++)
       if(a[in] < a[min])
       min = in;
     swap(out, min);
   }
 }
 
 private void swap(int one, int two) {
   long temp = a[one];
   a[one] = a[two];
   a[two] = temp;
 }
}
