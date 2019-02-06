public class EngineSuzuki implements CarEngineIntf
{
    public int currentGear;

    public void ignite()
    {
        System.out.println("Suzuki Engine Started");
    }

    public void changeGear(int toGear)
    {
        System.out.println("Gear Changing from " + this.currentGear + " to " + toGear);
        this.currentGear = toGear;
    }
    public void stopEngine()
    {
        System.out.println("Suzuki Engine Stopped");
    }
}

