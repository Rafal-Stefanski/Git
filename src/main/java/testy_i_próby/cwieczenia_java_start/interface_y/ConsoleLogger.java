package testy_i_próby.cwieczenia_java_start.interface_y;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        System.out.println(text);
    }
}
