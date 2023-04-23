public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add();
//        myArrayList.add();
//        myArrayList.sort();
//        myArrayList.remove();
//        myArrayList.remove();
//        myArrayList.clear();
//        myArrayList.get();
//        myArrayList.contains();
//        myArrayList.indexOf();
//        myArrayList.lastIndexOf();
//        myArrayList.size();
        myArrayList.add(100);
        myArrayList.add(10);
        myArrayList.add(10000);
        myArrayList.sort();
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
    }
}