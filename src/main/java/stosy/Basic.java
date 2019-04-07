package stosy;

public class Basic {
    public static void main(String[] args) {

        Stacks<Integer> numberInP = new Stacks();

        int l=35;
        int p=2;
        while (l>0){
            numberInP.push(l%p);
            l=l/p;
        }
        while (!numberInP.isEmpty()){
            System.out.print(numberInP.pop());
        }
    }
}
