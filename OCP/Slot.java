
public abstract class Slot {
    private int resourceId;
    public abstract void markFree();
    public abstract void markBusy();
    public abstract int getId();
    public abstract void setId(int id);

}
