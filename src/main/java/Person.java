import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();


    // CONSTRUCTORS//
    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }
    // METHODS //

    public void addParents(Person father, Person mother) {

        List<Person> fathersKids = father.children;
        List<Person> mothersKids = mother.children;
        if (!fathersKids.contains(this))  {
            fathersKids.add(this);
            this.father = father;
            System.out.println("father set.");
        } else System.err.println("This person was already set on this father.\nAborting operation...");

        if (!mothersKids.contains(this)) {
            mothersKids.add(this);
            this.mother = mother;
            System.out.println("Mother set.");
        } else System.err.println("This person was already set on this mother.\nAborting operation...");

    }

    public void addChild(Person child) {
        if (!this.children.contains(child)) {
            this.children.add(child);
            System.out.println("Child added.");
        } else {
            System.out.println("Child already added to this person's list of children.");
        }
    }

    public  void addPet(Pet pet) {
        if (!this.pets.contains(pet)) {
            this.pets.add(pet);
            System.out.println("Pet added.");
        } else {
            System.out.println("Pet already added to this person's list of pets.");
        }
    }

    public void addSibling(Person sibling) {
        if (this.siblings.contains(sibling)) {
            this.siblings.add(sibling);
            System.out.println("Sibling added.");
        } else {
            System.out.println("Sibling already added to this person's list of siblings.");
        }
    }

    public List<Person> getGrandchildren() {
        List<Person> grandchildren = new ArrayList<>();
        for ( Person child: this.children) {
            for ( Person grandchild : child.children) {
                grandchildren.add(grandchild);
            }
        }
        return  grandchildren;
    }

    // GETSET //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
