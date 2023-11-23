public abstract class baseObject {
    protected boolean pickable;

    public baseObject(boolean pickable)
    {
        this.pickable=pickable;
    }

    public void setPickable(boolean pickable) {
        this.pickable = pickable;
    }

    public boolean isPickable() {
        return pickable;
    }
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
        if(this.pickable==true)
            return "a pickable object";
        else
            return "an unpickable object";
    }
    @Override
    public int hashCode()
    {
        if(pickable) return 25469573;
        else return 3521;
    }
}
