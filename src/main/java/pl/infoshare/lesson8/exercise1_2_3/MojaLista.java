package pl.infoshare.lesson8.exercise1_2_3;

import java.util.ArrayList;

public class MojaLista extends ArrayList {

    @Override
    public Object get(int index) {
        return super.get(0);
    }
}
