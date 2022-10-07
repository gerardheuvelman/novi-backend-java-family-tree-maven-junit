import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void addParentsAddsBothParents() {
        // ARRANGE
        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Person harm = new Person("Harmen","Cornelis","Heuvelman","male",71);
        Person greet = new Person("Greetje","Kool","female", 72);

        // ACT
        me.addParents(harm, greet);

        // ASSERT
        assertEquals(me.getFather(), harm);
        assertEquals(me.getMother(),greet);
        assertTrue(harm.getChildren().contains(me));
        assertTrue(greet.getChildren().contains(me));
    }

    @org.junit.jupiter.api.Test
    void addChildCorrectlyAddsAChild() {
        // ARRANGE
        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Person sophie = new Person( "Sophie", "Heuvelman","female", 14);

        // ACT
        me.addChild(sophie);

        // ASSERT
        assertTrue(me.getChildren().contains(sophie));
        assertEquals(sophie.getFather(), me);
    }

    @org.junit.jupiter.api.Test
    void addPetAddsAPet() {
        // ARRANGE
        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Pet teil = new Pet("Teil", 10, "Labrador");

        // ACT
        me.addPet(teil);

        // ASSERT
        assertTrue(me.getPets().contains(teil));
        assertEquals(teil.getOwner(), me);
    }

    @org.junit.jupiter.api.Test
    void addSiblingAddsASibling() {
        // ARRNAGE
        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Person hendrik = new Person("Hendrik","Harmen","Heuvelman","male", 50);

        // ACT
        me.addSibling(hendrik);

        // ASSERT
        assertTrue(me.getSiblings().contains(hendrik));
        assertTrue(hendrik.getSiblings().contains(me));

    }

    @org.junit.jupiter.api.Test
    void getGrandchildren() {

        // ARRANGE
        Person greet = new Person("Greetje","Kool","female", 72);
        Person me = new Person("Gerard", "Harmen", "Heuvelman", "male",48);
        Person sophie = new Person("Sophie", "Heuvelman", "female", 14);
        greet.addChild(me);
        me.addChild(sophie);

        // ACT
        List<Person> grandchildren = greet.getGrandchildren();

        // ASSERT
        assertTrue(grandchildren.contains(sophie));

    }
}