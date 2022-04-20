public class WesternRingsFactory implements RingMaterials
{
    public Gold createGold()
    {
        return new Carat23Gold();
    }
    
    public Diamond createDiamond()
    {
        return new PrincessCutDiamond();
    }

    public Silver createSilver()
    {
        return new FineSilver();
    }

    public Platinum createPlatinum()
    {
        return new CopperPairdWithPlatinum();
    }

    @Override
    public Gold creategGold() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Diamond createdDiamond() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Silver createsSilver() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Platinum createspPlatinum() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
