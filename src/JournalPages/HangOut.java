package JournalPages;

import java.util.ArrayList;

public class HangOut extends Event {

    final private ArrayList<String> participants = new ArrayList<>();

    public HangOut(String name) {
        super(name);
        setType(2);
    }
}
