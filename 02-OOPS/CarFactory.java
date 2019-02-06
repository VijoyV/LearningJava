public class CarFactory
{

    public static void main (String[] args)
    {

        Car aCar = new CarMaruti();

        aCar.assembleCar(new EngineFiat(), new BodySwift());

        aCar.driveCar();
    }

}
