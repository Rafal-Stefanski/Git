package pl.sda.zadania_coinpo.toolshop;

public class ToolsShop {
    public static void main(String[] args) {
        Hammer hammer1 = new Hammer("T2000", 150.6, 1);
        Hammer hammer2 = new Hammer("T2100", 250.6, 15);
        Hammer hammer3 = new Hammer("T2200", 350.6,25);

        Saw saw1 = new Saw("RX-78", 80.6, 100);
        Saw saw2 = new Saw("RX-68", 180.6, 40);

// ->>  generowanie przez Ctrl+J :
        Tool[] tools = {hammer1, hammer2, hammer3, saw1, saw2};
        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            System.out.println(tool.description());
        }
    }
}
