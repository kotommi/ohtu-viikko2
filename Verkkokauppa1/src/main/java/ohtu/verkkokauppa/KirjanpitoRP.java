package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface KirjanpitoRP {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
