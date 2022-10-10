public class Main {
    public static void main(String[] args) {

        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Pet teil = new Pet("Teil", 10, "Labrador");

        me.addPet(teil);
        System.out.println("Program complete...");
    }
}
