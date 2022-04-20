abstract class RingsStore 
{
    Ring r;
    abstract Ring createRing(String name);
    void orderring(String name)
    {
        r=createRing(name);
        r.prepare();
        r.putcarat();
        r.putprice();

    }
    
}
