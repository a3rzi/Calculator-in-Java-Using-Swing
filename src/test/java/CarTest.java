import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void CARNAME() {
        Mashine samand = new Mashine("a");
        System.out.println(samand.name);
        Mashine pride = new Mashine("pride");
        System.out.println(pride.name);



    }
    class Mashine{
        int speed;
        int model;
        String name;

         Mashine(){
            System.out.println("mashine ezafe shod");
        }
        Mashine(String mark){
            this.name=mark;
        }
        void drive(){
            System.out.println("drive in the road");
        }
        void tormoz(){
            System.out.println("tormoz kon");
        }

    }
}


