package src;

import java.util.Comparator;

public class SortareCursDupaStudentiInscrisi implements Comparator<Curs>{

    @Override
    public int compare(Curs o1, Curs o2) {
        return o1.studenti.size()-o2.studenti.size();
    }
    
}
