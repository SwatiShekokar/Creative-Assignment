public class TraditionalRingStore extends RingsStore 
{
    Ring createRing(String name) 
    {
        RingMaterials rm= new TraditionalRingsFactory();
        if (name.equalsIgnoreCase("Gold"))
        {
            r = new TraditionalGoldRing(rm);
        }

        else if (name.equalsIgnoreCase("Silver")) 
        {
            r = new TraditionalSilverRing(rm);
        }

        return (r);
    }

    
}
