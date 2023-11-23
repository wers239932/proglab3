public interface DoorOpener {
    public default boolean open(Door door)
    {
        if(door.getClosed()==true)
        {
            System.out.println("i can't open it");
            return false;
        }
        else
        {
            System.out.println("it's openable. wtf?");
            return true;
        }
    }
}
