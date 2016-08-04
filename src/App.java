import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

class Machine {
    private  String name;


    public Machine() {
        System.out.println("Constructor Running!");

        name = "Arnie";
    }

    public Machine(String name) {

        System.out.println("Second Constructor Running!");
        this.name = name;
    }

    public Machine(String name, int code) {

        System.out.println("Third constructor Running!");
        this.name = name;
        this.code = code;
            
    }
    }

}

/**
 * Created by LordwolF on 8/3/2016.
 */
public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");

        new Machine();

    }
}
