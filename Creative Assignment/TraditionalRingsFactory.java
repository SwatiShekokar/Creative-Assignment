public class TraditionalRingsFactory implements RingMaterials 
{
    public Gold createGold()
    {
        return new Carat24Gold();
    }
    
    public Diamond createDiamond()
    {
        return new OvalCutDiamond();
    }

    public Silver createSilver()
    {
        return new SterlingSilver();
    }

    public Platinum createPlatinum()
    {
        return new TitaniumPairdWithPlatinum();
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
