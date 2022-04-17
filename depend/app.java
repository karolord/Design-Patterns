import java.util.LinkedList;

/**
 * app
 */
public class app {
    public static void main(String[] args) {
        tasklist t = new tasklist();
        t.Injecttask(new read());
        t.Injecttask(new read());
        t.Injecttask(new read());
        t.Injecttask(new write());
    }
}

interface tasks {
    public void run();
}

class tasklist {
    LinkedList<tasks> tlist = new LinkedList<tasks>();

    public void Injecttask(tasks task) {
        tlist.add(task);
    }
}

class write implements tasks {
    public void run() {
        System.out.println("write");
    }
}

class read implements tasks {
    public void run() {
        System.out.println("read");
    }
}

class draw implements tasks {
    public void run() {
        System.out.println("draw");
    }

}