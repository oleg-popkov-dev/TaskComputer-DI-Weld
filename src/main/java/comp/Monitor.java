package comp;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;



public class Monitor implements IMonitor {


    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }


    private String name = "monitor";


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
