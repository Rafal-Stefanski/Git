package challengerocket.ey_gds;

import java.math.BigInteger;

class App {
    public boolean isEgoistic(String N) {

        BigInteger number = new BigInteger(N);

        BigInteger numberRemainder = number.remainder(BigInteger.TEN);
        BigInteger numberSquaredRemainder = number.pow(2).remainder(BigInteger.TEN);

        if (numberRemainder != numberSquaredRemainder){
            return false;
        }
        return true;
    }
}
