package testy_i_próby.cwieczenia_java_start;

public class ForEach {
    public static void main(String[] args) {

        String[] names = {"Marcin", "Monika", "Daniel", "Adam", "Kasia"};

        System.out.println("Pętla for");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        System.out.println("Pętla for each - krótszy kod");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
