/**
 * This is an abstract class.
 *
 * This is an exercise :
 *
 * One need to implement intermediate level of classes as family (Dog and Cat)
 * and concrete classes (Tiger, Domestic Cat, Wolf, Fox, Domestic Dof etc)
 *
 *
 */

public abstract class Animal
{
    // Values: CAT & DOG
    private String animalFamily;

    // Values
    // CAT: Tiger, DomesticCat
    // DOG: Wolf, Fox, Doggy
    private String animalType;

    // Implement in class DOG & CAT
    public abstract String setFamily (String family);

    // Implement in class Wolf, Fox, Doggy, Tiger, MeowCat
    public abstract String setType (String type);

    // Implement in class Wolf, Fox, Doggy, Tiger, MeowCat
    public abstract String makeSound();

    public String getFamily()
    {
        return animalFamily;
    }

    public String getType()
    {
        return animalType;

    }

}
