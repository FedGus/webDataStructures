
let nElems = 0;                    
let a = new Array();    

   function find(searchKey){                                      
     let j;
     for(j = 0; j < nElems; j++)                                           
       if(a[j] == searchKey)                                               
         break;                                                                                                      
     if(j == nElems)                                                   
       return false;           
     else
       return true;   
    }
   
    //-------------------------Вставка элемента------------------
   
    function insert(value){        
      a[nElems] = value;                  
      nElems++;                          
    }
    
    //--------------------------Удаление элемента----------------
    
    function deleteEl(value) {
      let j;
      for(j = 0; j < nElems; j++)                     
        if( value == a[j] ) 
          break;
      if(j == nElems)                             
        return false;
      else{                                     
        for(let k = j; k < nElems; k++)          
          a[k] = a[k+1];
        nElems--;                            
        return true;
      }
    }
    
    
    alert("Поиск, вставка и удаление элементов из массива");

    insert(123);                          
    insert(-19);
    insert(0);
    insert(44);
    insert(53);
                      
    
    //------------------------Поиск элемента---------------------
    let numF = prompt(a + "\n Введите искомое число");
    if (find(numF)) 
    alert("Такое число есть");
    else 
    alert("Такого числа нет");
    
    //------------------------Добавление элемента----------------
    let numIns = prompt(a + "\n Введите число, которое хотите добавить");
    insert(numIns);
    
    //------------------------Удаление элемента------------------
    let numDel = prompt(a + "\n Введите число, которое хотите удалить");
    if (deleteEl(numDel)) 
    alert(a + "\n Элемент со значением " + numDel + " удален");
    else 
    alert("Число не удалено");



   









