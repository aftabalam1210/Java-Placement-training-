package Exception;
import java.util.concurrent.Semaphore;

class AmusementPark {
    Semaphore ticket = new Semaphore(3);

    void shoot() {
        try {
            ticket.acquire();
            System.out.println(Thread.currentThread().getName() + " got the gun and is shooting!");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ticket.release();
            System.out.println(Thread.currentThread().getName() + " released the gun.");
        }
    }
}

class Persons extends Thread {
    AmusementPark park;

    Persons(AmusementPark park) {
        this.park = park;
    }

    public void run() {
        park.shoot();
    }
}

public class Semaphores {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();
        Thread t = Thread.currentThread();
        Persons p1 = new Persons(park);
        Persons p2 = new Persons(park);
        Persons p3 = new Persons(park);
        Persons p4 = new Persons(park);
        Persons p5 = new Persons(park);
        Persons p6 = new Persons(park);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
    }
}
