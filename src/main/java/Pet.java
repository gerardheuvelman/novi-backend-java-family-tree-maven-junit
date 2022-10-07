public class Pet {
    private String name;
    private int age;
    private String species;
    private Person owner;

    // CONSTRUCTOR //
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // METHODS //
    public  void AddOwner(Person owner) {
        this.owner = owner;
    }

    // GETSET //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }
//      THIS METHODS IS REDUNDANT
//    public void setOwner(Person owner) {
//        this.owner = owner;
//    }
}
