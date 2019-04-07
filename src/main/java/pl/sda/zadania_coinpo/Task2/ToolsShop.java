package pl.sda.zadania_coinpo.Task2;

public class ToolsShop {
    public static void main(String[] args) {
        
        Hammer hammer1 = new Hammer("T2000", 150.6,1);

        Saw saw1 = new Saw("RX-78", 80.6, 100);

//        generowanie przez Ctrl+J :
        Tool [] tools = {hammer1, saw1};
        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            
        }

        
        System.out.println("hammer1 price = " + hammer1.getPrice());

        System.out.println("saw1 price = " + saw1.getPrice());
    }
 
}
