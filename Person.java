public class Person extends objectWithItems implements DoorOpener, LookAtObject, MoodController{
    private int mood;
    private String name;
    public Person(String name)
    {
        super(false);
        this.mood=100;
        this.name=name;
    }
    @Override
    public void look(baseObject _object)
    {
        System.out.println(_object.toString());
        this.decreaseMood(7);
        this.tellMood();
    }

    @Override
    public void setMood(int mood)
    {
        if(mood>0)
            this.mood=mood;
    }
    @Override
    public void decreaseMood(int diff)
    {
        if(diff>0)
            this.mood-=diff;
        if(this.mood<=0)
        {
            this.rest();
        }
    }
    @Override
    public void tellMood()
    {
        System.out.println("i'm felling for " + this.mood + " out of 100");
    }
    public void rest()
    {
        System.out.println("i need to relax for a second");
        this.mood=100;
    }
    @Override
    public String toString()
    {
        String answer = "that's a me, Mario. Of course thats's Alice, i am Alice";
        for(baseObject _object: this.getObjectsInside())
        {
            answer+=_object.toString();
        }
        return answer;
    }
    @Override
    public boolean equals(baseObject _object)
    {
        if(_object.getClass()!=Person.class)
            return false;
        else {
            if(this.name!=((Person) _object).name)
                return false;
            else {
                if (this.getObjectsInside()!=((objectWithItems) _object).getObjectsInside())
                    return false;
                else return true;
            }
        }
    }
    @Override
    public int hashCode()
    {
        int hash=mood*3583804;
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
