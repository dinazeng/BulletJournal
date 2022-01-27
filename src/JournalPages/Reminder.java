package JournalPages;

public class Reminder extends Entry {

    private int priority;

    public Reminder(String name) {
        super(name);
        setType(3);
    }

    public int getPriority(){
        return priority;
    }

    public boolean setPriority(int priority){
        if (priority > 5 || priority < 0){
            return false;
        } else {
            this.priority = priority;
            return true;
        }
    }
}
