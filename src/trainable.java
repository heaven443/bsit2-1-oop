interface trainable {
    void performTrick();
}

class trainableDog extends dog implements trainable {
    public trainableDog(String name, int age) {
        super(name,age);
    }
    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Sits and shakes hands");
    }
}

class trainableBird extends bird implements trainable {
    public trainableBird(String name, int age){
        super(name, age);
    }
    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}

class trainer {
    public void trainPet(trainable pet){
        pet.performTrick();
    }
}
