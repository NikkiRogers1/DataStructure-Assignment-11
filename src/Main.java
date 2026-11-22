

public class Main {
    public static void main(String[] args) {

        Sorts sort = new Sorts();

        sort.initValues();
        sort.printValues();

        System.out.println(sort.isSorted());
        
        sort.selectionSort(sort.value);
        
        sort.printValues();
       System.out.println(sort.isSorted());
    }
}
    
