
public class ResourceAllocator
{
    public int allocate()
    {
        Slot slot=findFreeSlot();
        slot.markBusy();
        return slot.getId();
    }

    public void free(Slot slot){
        slot.markFree();
    }
    private Slot findFreeSlot()
    {
        return null;
    }
}
