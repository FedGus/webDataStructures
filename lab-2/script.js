
class SelectSort {
          // Количество элементов в массиве
  
  //-----------------------------------------------------------
  
  constructor(a, max, nElems){  
    this.max = max;  // Конструктор
    this.a = a;    
    this.nElems = nElems;         // Пока нет ни одного элемента
  }
  
   //-------------------------Вставка элемента------------------
 
  set insert(value){        // Вставка элемента в массив
    this.a[this.nElems] = this.value;                  // Собственно вставка
    this.nElems++;                          // Увеличение размера
  }
  
   //-------------------Вывод массива---------------------------
  
  get display(){                   // Вывод содержимого массива
    for(let j = 0; j < nElems; j++)           // Для каждого элемента
      console.log(a[j] + " ");      // Вывод
    console.log("");
  }
  
  set selectSort(a) {
    let out;
    let in_arr;
    let min;
    for(out = 0; out < nElems-1; out++){
      min = out;
      for(in_arr = out+1; in_arr < nElems; in_arr++)
        if(a[in_arr] < a[min])
        min = in_arr;
      swap(out, min);
    }
  }
  
  static swap(a, one, two) {
    let temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
 }


 class InsertSort {
  // Количество элементов в массиве

//-----------------------------------------------------------

constructor(a, max, nElems){  
this.max = max;  // Конструктор
this.a = a;    
this.nElems = nElems;         // Пока нет ни одного элемента
}

//-------------------------Вставка элемента------------------

set insert(value){        // Вставка элемента в массив
this.a[this.nElems] = this.value;                  // Собственно вставка
this.nElems++;                          // Увеличение размера
}

//-------------------Вывод массива---------------------------

get display(){                   // Вывод содержимого массива
for(let j = 0; j < nElems; j++)           // Для каждого элемента
console.log(a[j] + " ");      // Вывод
console.log("");
}

set insertSort(a) {
let out;
let in_arr;

for(out = 1; out < nElems; out++) {
  let temp = a[out];
  in_arr = out;
  while(in_arr > 0 && a[in_arr-1] >= temp) {
    a[in_arr] = a[in_arr-1];
    --in_arr;
  }
  a[in_arr] = temp;
}
}

static swap(a, one, two) {
let temp = a[one];
a[one] = a[two];
a[two] = temp;
}
}

 
let maxSize = 2500;
     
console.log("Сортировка массива методом выбора");
 //Сортировка выбором
 let a = new Array();         // Создание массива
 let nElems = 0; 


 arr = new SelectSort(a, maxSize, nElems);
 
 for (let i = 0; i < maxSize; i++) {
   let x = (Math.random()*((1000-0)+1))+0;
   arr.insert = x;
 }
 
 //arr.display();
 let start = new Date();
 arr.selectSort = a;
let end = new Date();
let allTime = end - start;
 console.log("Время затраченное на сортировку методом выбора: " + new Date().getMilliseconds(allTime) + " милисекунд");
 //arr.display();
 
 console.log("Сортировка массива методом вставки");
 //Сортировка вставками
 arr2 = new InsertSort(a, maxSize, nElems);
 
 for (let i = 0; i < maxSize; i++) {
   let x = (Math.random()*((100-0)+1))+0;
   arr2.insert = x;
 }
 
 //arr.display();
 let start2 = new Date();
 arr.insertSort = a;
let end2 = new Date();
let allTime2 = end2 - start2;
 console.log("Время затраченное на сортировку методом вставки: " + new Date().getMilliseconds(allTime2) + " милисекунд");
 //arr.display();*/





