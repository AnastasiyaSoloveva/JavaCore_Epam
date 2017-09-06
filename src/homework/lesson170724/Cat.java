package homework.lesson170724;

public class Cat implements Pet {

   private Brain catsBrain = new Fed();


   private class Hungry implements Brain{

       @Override
       public void feed() {
           rub();
           meow();
           eat();
           catsBrain = new Fed();
       }


       @Override
       public void play() {
           ignore();

       }

       @Override
       public void wash() {
           scratch();
           hiss();
           runAway();

       }
   }


    private class Fed implements Brain{

        @Override
        public void feed() {
            ignore();

        }

        @Override
        public void play() {
            meow();
            playWith();
            runAway();
            meow();
            catsBrain = new Hungry();

        }

        @Override
        public void wash() {
            meow();
            scratch();
            stand();
            catsBrain = new Hungry();

        }


    }


    @Override
    public void feed() {
        catsBrain.feed();

    }

    @Override
    public void play() {
        catsBrain.play();

    }

    @Override
    public void wash() {
       catsBrain.wash();

    }

    private void rub() {
        System.out.println("rubs");
    }
    private void runAway() {
        System.out.println("runs away");
    }

    private void hiss() {
        System.out.println("hhhhh");
    }

    private void scratch() {
        System.out.println("scratches");
    }

    private void meow() {
        System.out.println("meows");
    }


    private void eat() {
        System.out.println("eats");
    }

    private void stand() {
        System.out.println("stands");
    }


    private void ignore() {
        System.out.println("ignores");
    }


    private void playWith() {
        System.out.println("plays");
    }
}
