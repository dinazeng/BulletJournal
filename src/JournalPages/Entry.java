package JournalPages;

import java.time.LocalDateTime;

public class Entry {
    final private String name;
    private int type = 0;
    private String desc;
    private LocalDateTime time;
    private String location;

    public Entry(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
