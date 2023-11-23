public class Key extends baseObject {
    private Size size;
    public Key()
    {
        super(true);
        this.size=Size.SMALL;
    }
    @Override
    public boolean equals(baseObject _object)
    {
        if(this.getClass()!=_object.getClass())
            return false;
        else
        {
            if(this.pickable!=_object.pickable || this.size!=((Key) _object).size) return false;
            return true;
        }
    }
    @Override
    public String toString()
    {
        return "a " + size + " Key";
    }
    public int hashCode()
    {
        int hash=this.getClass().hashCode();
        if(pickable) hash+= 25469573;
        else hash+= 3521;
        hash=hash*37933678+size.hashCode();
        return hash;
    }
}
