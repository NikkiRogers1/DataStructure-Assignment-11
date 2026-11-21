

public class Main {
    public static void main(String[] args) {

        Sort sort = new Sort();

        sort.initValues();
        sort.printValues();

        System.out.println(sort.isSorted());

        sort.swap(4, 1);
        
        sort.printValues();
       
    }
}
    
