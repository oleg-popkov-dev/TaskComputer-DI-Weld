package comp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@ApplicationScoped
public class Computer implements IComputer {


    private String name;

    private IMonitor monitor;

    private IMouse mouse;



    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    @Inject
    public Computer(IMouse mouse, IMonitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }



    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + getMonitor().getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + getMonitor().getName());
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }
}
