package homework.lesson170724;

public class Rat implements Pet{

    Brain ratsBrain = new Hungry(this);


    @Override
    public void feed() {
        ratsBrain.feed();

    }

    @Override
    public void play() {
        ratsBrain.play();

    }

    @Override
    public void wash() {
        ratsBrain.wash();

    }


    public void ignore() {
        System.out.println("ignores");
    }

    public void twistTheWheel() {
        System.out.println("twists the wheel");
    }

    public void stayCarlm() {
        System.out.println("stands");
    }

    public void squeak() {
        System.out.println("pi-pi-pi");
    }

    public void eat() {
        System.out.println("eats");
    }

    public void run() {
        System.out.println("runs away");
    }
}


class Fed implements Brain{

   private Rat rat;

    public Fed(Rat rat) {
        this.rat = rat;
    }

    @Override
    public void feed() {
        rat.ignore();

    }

    @Override
    public void play() {
        rat.twistTheWheel();
        rat.ratsBrain = new Hungry(rat);

    }

    @Override
    public void wash() {
        rat.stayCarlm();

    }

}

class Hungry implements Brain{

   private Rat rat;

    public Hungry(Rat rat) {
        this.rat = rat;
    }

    @Override
    public void feed() {
        rat.squeak();
        rat.eat();
        rat.run();
        rat.ratsBrain = new Fed(rat);

    }

    @Override
    public void play() {
        rat.ignore();

    }

    @Override
    public void wash() {
        rat.squeak();
        rat.run();

    }
}

