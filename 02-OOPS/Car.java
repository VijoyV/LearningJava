/**
 *
 * This is the template to build a car.
 * It is an abstract class, but composition of two other interfaces - CarEngineIntf, CarBodyIntf
 *
 */

public abstract class Car
{
    CarEngineIntf engine;
    CarBodyIntf body;

    //-- Abstract Method. Giving a Chance to the Implementer/developer to decide
    //-- the combination of the car at instantiation
    public abstract void assembleCar(CarEngineIntf engine, CarBodyIntf body);


    //-- this is an implemented behavior in the base class.
    //-- You may override or call it from the implemented class using 'super'
    public void driveCar()
    {

        body.openDoor(1);
        engine.ignite();
        engine.changeGear(1);
        engine.changeGear(2);
    }

    //More Concrete Functionality goes Here

}