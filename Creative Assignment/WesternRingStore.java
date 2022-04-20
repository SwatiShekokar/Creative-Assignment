public class WesternRingStore extends RingsStore
{
    Ring createRing(String name) 
    {
        //Ring ring = null;
        RingMaterials rm = new WesternRingsFactory();
        if (name.equalsIgnoreCase("Diamond"))
        {
            r = new WesternDiamondRing(rm);
        }

        else if (name.equalsIgnoreCase("Platinum")) 
        {
            r = new WesternPlatinumRing(rm);
        }

        return (r);
    }

    
}
