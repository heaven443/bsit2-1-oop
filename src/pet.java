abstract class pet {
    protected String name;
    protected int age;

    public pet(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("\nPet Name: " + name + ", Age: " + age);
    }
}

    class dog extends pet {
        public dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Woof! Woof!");
        }
    }

    class cat extends pet {
        public cat(String name, int age){
            super(name, age);
        }
        @Override
        public void makeSound() {
                System.out.println(name + " says: Meow! Meow!");
        }
    }

    class bird extends pet {
        public bird(String name, int age){
            super(name, age);
        }
        @Override
        public void makeSound() {
            System.out.println(name + " says: Tweet! Tweet!");
        }

    }
