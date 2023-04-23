### Karsybai-Baibolat

### Second Assignment Documentation

### Main File Main.java [(source)](https://github.com/Baibola7/Karsybai-Baibolat/blob/master/src/Main.java)

### All tasks in lab-2 works the same way. All you needed to uncomment Example lines and start project

### MyArrayList [(source)](https://github.com/Baibola7/Karsybai-Baibolat/blob/master/src/MyArrayList.java)


### Method GET:
Method get that provide exact item of array by index.

### Explanation:
Firstly, check by method isExist is object in array. Then, return item of array by index.

### Solution:
 

        @Override
    public Object get(int index){
        return null;
    }

        @Override
    public Object get(int index) {
        if (index < arr.length) {
            return arr[index];
        }
        else{
            return "Index not found";
        }
    }
 
### Method SIZE:
Method size that return length of array.

### Explanation:
Simply return size of array.

### Solution:

     @Override
     public int size() {
     return size;
     }
```
```java
  @Override
  public int size() {
    /**
     * Method size that return length of array.
     * @return int.
     */
    return size;
  }
```
### Method CONTAINS:
Method contains that define is object exist in array. 

### Explanation:
Firstly, condition to check is array empty or not, after it goes through loop to define equal to given Object element. Then return Boolean value.

### Solution:
          
     @Override
     public boolean contains(Object o) {
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == o) {
        return true;
        }
        }
        return false;
        }

```
    @Override
    public boolean contains(Object o){
        /**
         * Method contains that define is object exist in array.
         * @return boolean value.
         */
        return false;
    }
```
### Method ADD:
Method add that add to array one object.

### Explanation:
Condition to check is free space in array, otherwise increase memory by method increaseBuffer. Then add to next element item.

### Solution:
```
     @Override
     public void add(Object item) {
        if (size == arr.length) {
        increaseBuffer();
        }
        else {
        arr[size++] = item;
        }
        }
```
```
   @Override
   public void add(Object item) {
        /**
         * Method add that that add to array addition object.
         * @return null;
         */
        }
```
### Method ADD:
Method addAt that add to aray one object at exact index. 

### Explanation:
Condition to check is index relevant to array by method isExist. Condition to check is free space in array, otherwise increase memory by method increaseBuffer. Then by loop we replace each element by -1, from index to array length.

### Solution:
```
  @Override
    public void add(Object item, int index) {
    }
```
### Explanation:
Firstly, we throw error if index is not relevant. Than create new node and couple conditions to check equals of head, next and previous. Finally, add to array and increase size.
```
 @Override
    public void add(Object item, int index) {
        /**
         * Method add that add to array one object at exact index.
         * @return null;
         */
        if (index >= arr.length) {
            increaseBuffer();
        } else {
            arr[index] = item;
        }
        size++;
    }
```
### Method REMOVE:
Method remove that remove one object from array.

### Explanation:
Condition to check is item relevant to array by method contains. Then by indexOf we check is first occurence is >= 0. Then remove element and return true.

### Solution:
```
   @Override
    public boolean remove(Object item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().equals(item.toString())) {
                System.out.println(remove(i));
                return true;
            }
        }
        return false;
    }
```
```
   @Override
    public boolean remove(Object item){
        /**
         * Method remove that remove one object from array.
         * @return boolean value.
         */
        return false;
    }
```
### Method REMOVE:
Method removeAt that remove one oject from array by index.

### Explanation:
Condition to check is index relevant to array by method isExist. Then go through loop to replace each element from index to length of array. Finaly, remove and return element.

### Solution:
```
   @Override
    public Object remove(int index){
        for(; index < size; index++){
            if(index < arr.length - 1){
                arr[index] = arr[index + 1];
            }
        }
        size--;
        return "Successfully";
    }
```
```
   @Override
    public Object remove(int index){
        /**
         * Method remove that remove one oject from array by index.
         * @params item - removed element
         * @return removed object.
         */
        return null;
    }
```
### Method CLEAR:
Method clear that clear array and array size.

### Explanation:
Simply clear array or replace our array with new empty data.

### Solution:
```
   @Override
    public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }
```
```
   @Override
    public void clear() {
        /**
        Method clear that clear array and array size.
        */
    }

```
### Method INDEXOF:
Method indexOf that returns the position of the first occurrence of specified character(s) in a string.

### Explanation:
Check by method contains is object in array list. Then by loop check eaual items to return index, otherwise return -1.

### Solution:
```
   @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i].toString().equals(o.toString())){
                return i;
            }
        }
        return 1;
    }
```
```
   @Override
    public int indexOf(Object o){
        /**
         * Method indexOf that returns the position of the first occurrence of specified character(s) in a string.
         * @return int.
         */
        return 0;
    }
```
### Method LASTINDEXOF:
Method lastIndexOf that return the position of the last occurrence of specified character(s) in a string.

### Explanation:
Check by method contains is object in array list. Then by loop check equal items and i > index, to equal index = 1, then to return index.

### Solution:
```
   @Override
    public int lastIndexOf(Object o) {
        for (int i = arr.length - 1; i >= 0;  i--){
            if (arr[i].toString().equals(o.toString())){
                return i;
            }
        }
        return 1;
    }
```
```
@Override
    public int lastIndexOf(Object o){
        /**
         * Method lastIndexOf that return the position of the last occurrence of specified character(s) in a string.
         * @return int.
         */
        return 0;
    }
```
### Method SORT:
 Method sort that sort elements of a collection.
 
### Explanation:
 We use nested loops, to check by conditions in order to swap elements with places, to get right sorted list.
 
### Solution:
```
  @Override
    public void sort() {
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                if ((int)arr[j] < (int) arr[i]){
                    Object item = arr[i];
                    arr[i] = arr[j];
                    arr[j] = item;
                }
            }
        }
    }
}
```
```
  @Override
    public void sort() {
        /**
         * Method sort that sort elements of a collection.
         */
    }
}
```
