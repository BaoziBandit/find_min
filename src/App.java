public class App {
    public static void main(String[] args){
        int[] numbers = MinFinder.readIntegers();
        System.out.println("Min : " + MinFinder.findMin(numbers));
    } 
}
