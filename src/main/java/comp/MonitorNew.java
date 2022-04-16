package comp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;



public class MonitorNew implements IMonitor{

    private String name = "monitor new";

    public MonitorNew(String name) {
        this.name = name;
    }

    public MonitorNew() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
