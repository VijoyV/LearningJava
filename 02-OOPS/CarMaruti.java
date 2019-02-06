public class CarMaruti extends Car
{


    public void assembleCar(CarEngineIntf engine, CarBodyIntf body)
    {
        super.engine = engine;
        super.body = body;
    }

    public void driveCar()
    {
        super.driveCar();
    }



    //More Concrete Functionality goes Here

}