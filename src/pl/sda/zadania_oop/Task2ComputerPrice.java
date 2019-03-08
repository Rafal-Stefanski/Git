package pl.sda.zadania_oop;

    /**
    * 2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
    * convertToCelsius(double temperatureInFahrenheit), getComputerPrice()
    *
    * 4. W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
    * ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.
    */

public class Task2ComputerPrice {

    private double mainBoardPrice;
    private double processorPrice;
    private double ramMemoryPrice;
    private double hardDiskPrice;
    private double monitorPrice;
    private double VAT = 1.23;

        private Task2ComputerPrice(double mainBoardPrice, double processorPrice, double ramMemoryPrice, double hardDiskPrice, double monitorPrice) {
            this.mainBoardPrice = mainBoardPrice;
            this.processorPrice = processorPrice;
            this.ramMemoryPrice = ramMemoryPrice;
            this.hardDiskPrice = hardDiskPrice;
            this.monitorPrice = monitorPrice;
        }

        public static void main(String[] args) {
            Task2ComputerPrice computerPrice = new Task2ComputerPrice(500,1200,400,600,950);

            System.out.println("Computer price (inc.VAT): " + computerPrice.getComputerPrice());
            System.out.println("Monitor price (inc.VAT): " + computerPrice.getMonitorPrice());
            System.out.println("Computer with monitor (inc.VAT): " + computerPrice.getComputerwithMonitorPrice());


        }

        private double getComputerPrice() {
            return (mainBoardPrice + processorPrice + ramMemoryPrice + hardDiskPrice) * VAT;
        }

        private double getMonitorPrice() {
            return monitorPrice * VAT;
        }

        private double getComputerwithMonitorPrice(){
            return getComputerPrice() + getMonitorPrice();
        }


    }
