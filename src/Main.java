public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        Animal a1 = factoryAnimal.getAnimal("feline");
        System.out.println(a1);
        a1.makeSound();

        Animal a2 = factoryAnimal.getAnimal("canine");
        a2.makeSound();
        System.out.println(a2);
    }
}
