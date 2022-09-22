
public class TimeSlot extends Slot{
    private int resourceId;
    
    public void markFree()
    {
    }
    public void markBusy()
    {
    }
    
    public void setId(int id){
        resourceId=id;
    }
    public int getId(){
        return resourceId;
    }

}
