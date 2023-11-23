public class Door extends baseObject {
    private int number;
    private boolean closed;
    public Door(int number)
    {
        super(false);
        this.number=number;
        this.closed=true;
    }
    public boolean getClosed()
    {
        return this.closed;
    }
    @Override
    public boolean equals(baseObject _object)
    {
        if(this.getClass()!=_object.getClass())
            return false;
        else
        {
            if(this.pickable!=_object.pickable) return false;
            return true;
        }
    }
    @Override
    public String toString()
    {
        if(this.closed==true)
            return "it's a door number " + number + ", it's closed";
        else
            return "it's a door number " + number + ", it's opened";
    }
    @Override
    public int hashCode()
    {
        int hash=this.getClass().hashCode();
        if(pickable) hash+= 25469573;
        else hash+= 3521;
        if(closed) hash+= 25469573;
        else hash+= 3521;
        hash=hash*37933678+number;
        return hash;
    }
}
