import java.util.ArrayList;

public abstract class objectWithItems extends baseObject {

    protected ArrayList<baseObject> objectsInside = new ArrayList<baseObject>();
    public objectWithItems(boolean pickable)
    {
        super(pickable);
    }
    public void addObjects(baseObject _object)
    {
        objectsInside.add(_object);
    }

    public boolean removeObjects(baseObject _object)
    {
        if(objectsInside.contains(_object)) {
            objectsInside.remove(_object);
            return true;
        }
        else return false;
    }

    public ArrayList<baseObject> getObjectsInside() {
        return objectsInside;
    }
    @Override
    public boolean equals(baseObject _object)
    {
        if(this.getClass()!=_object.getClass())
            return false;
        else
        {
            if(this.pickable!=_object.pickable || this.getObjectsInside()!=((objectWithItems) _object).getObjectsInside()) return false;
            return true;
        }
    }
    @Override
    public String toString()
    {
        String description="this " + this.getClass().getName() + " " + " contains ";
        for(baseObject _object: objectsInside)
        {
            description+=_object.toString();
        }
        return description;
    }
    @Override
    public int hashCode()
    {
        int hash=0;
        if(pickable) hash+= 25469573;
        else hash+= 3521;
        for(baseObject _object: this.getObjectsInside())
        {
            hash=hash*19+_object.hashCode();
        }
        return hash;
    }
}
