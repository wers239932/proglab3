public class Table extends objectWithItems{
    public Table()
    {
        super(false);
    }
    public boolean equals(baseObject _object)
    {
        if(this.getClass()!=_object.getClass())
            return false;
        else
        {
            return true;
        }
    }
    @Override
    public String toString()
    {
        return "a table";
    }
}
