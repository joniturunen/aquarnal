package run.joni.aquarnalrest.data;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Entry {
    private Long id;
    private HashMap<String, Double> data;
    private String actionType;
    private LocalDateTime timestamp;

    // Constructors
    public Entry() {
    }
    // All that is settable
    public Entry(Long id, HashMap<String, Double> data, String actionType) {
        this.id = id;
        this.data = data;
        this.actionType = actionType;
        this.timestamp = LocalDateTime.now();
    }
    // All that is settable except id
    public Entry(HashMap<String, Double> data, String actionType) {
        this.data = data;
        this.actionType = actionType;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters
    public HashMap<String, Double> getData() {
        return data;
    }

    public void setData(HashMap<String, Double> data) {
        this.data = data;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    // toString
    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", data=" + data +
                ", actionType='" + actionType + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
