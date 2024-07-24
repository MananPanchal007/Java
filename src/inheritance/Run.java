package inheritance;

public class Run{
    public static void main(String[] args) {
        Me me = new Me();
        System.out.println(me.name);
        System.out.println(me.surname);
    }
}

class GrandFather {
    String name="Chimanbhai";
    String surname="Panchal";
}

class Father extends GrandFather{
    String name="Mehulkumar";
    int property=20;
}

class Mother extends GrandFather{
    String name="Priyankaben";
    int property=20;
}

class Me extends Father{
    String name="Manan";
}

