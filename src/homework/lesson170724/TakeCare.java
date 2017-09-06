package homework.lesson170724;



public class TakeCare {

    public static void main(String[] args) {

        Pet pet = new Cat();

        pet.play();
        System.out.println("-------");
        pet.feed();
        System.out.println("-------");
        pet.feed();
        System.out.println("-------");
        pet.wash();
        System.out.println("-------");
        pet.play();
        System.out.println("-------");

        Pet pet1 = new Rat();

        System.out.println("-------");
        pet1.play();
        System.out.println("-------");
        pet1.feed();
        System.out.println("-------");
        pet1.play();
        System.out.println("-------");
        pet1.wash();
        System.out.println("-------");
        pet1.feed();
        System.out.println("-------");



    }

}
