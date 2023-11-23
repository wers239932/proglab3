public class Main {
    public static void main(String[] args) {
        Place whitespace = new Place(100);
        Person alice=new Person("alice");
        whitespace.addObjects(alice);
        Place underground = new Place(70);
        whitespace.removeObjects(alice);
        underground.addObjects(alice);
        for(int i=1;i<=10;i++)
        {
            underground.addObjects(new Door(i));
        }
        for(baseObject _object : underground.getObjectsInside())
        {
            alice.look(_object);
            if(_object.getClass()==Door.class)
                alice.open((Door)_object);
        }
        for(baseObject _object : underground.getObjectsInside())
        {
            alice.look(_object);
            if(_object.getClass()==Door.class)
                alice.open((Door)_object);
        }
        Table table = new Table();
        Key key = new Key();
        table.addObjects(key);
        alice.look(table);
    }
}