
public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    public void eQuack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    public void eSwim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void quack()
    {
        System.out.println("Quack...");
    }

    public void swim()
    {
        System.out.println("Swim...");
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
