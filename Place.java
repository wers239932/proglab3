public class Place extends objectWithItems{
    private int lightlevel;
    public Place(int lightlevel)
    {
        super(false);
        this.lightlevel=lightlevel;
    }
    @Override
    public int hashCode()
    {
        int hash=lightlevel*3583804;
        hash=hash*4974+this.getClass().hashCode();
        if(pickable) hash+= 25469573;
        else hash+= 3521;
        for(baseObject _object: this.getObjectsInside())
        {
            hash=hash*19+_object.hashCode();
        }
        return hash;
    }
}
