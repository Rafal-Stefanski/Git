package pro2.weekend3.quiz_v2.solution;

import java.util.List;

public class ZadanieQuizowe {
    String pytanie;
    String[] odpowiedzi;

    public ZadanieQuizowe(String pytanie, List<String> odpowiedzi) {
        this.pytanie = pytanie;
        this.odpowiedzi = odpowiedzi.toArray(new String[0]);
    }
}

