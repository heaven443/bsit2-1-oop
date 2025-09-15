public class main {
    public static void main(String[] args) {

        petservice.main(args);

        System.out.println("Welcome to the Pet Clinic");
        System.out.println("=========================");
        pet dog = new dog("Buddy", 3);
        pet cat = new cat("Whiskers", 2);
        pet bird = new bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();

        System.out.println("\nTraining Session Started");
        System.out.println("=========================\n");

        trainer trainer = new trainer();
        trainableDog trainableDog = new trainableDog("Buddy", 3);
        trainableBird trainableBird = new trainableBird("Tweety", 1);

        trainer.trainPet(trainableDog);
        trainer.trainPet(trainableBird);
    }
}
