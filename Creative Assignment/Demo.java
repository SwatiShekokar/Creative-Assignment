public class Demo 
{
    public static void main(String args[])
    {
        RingsStore rs1, rs2;
        rs1=new TraditionalRingStore();
        rs1.orderring("Gold");
        System.out.println("\n");

        rs1.orderring("Silver");

        System.out.println("\n");

        rs2=new WesternRingStore();
        rs2.orderring("Diamond");
        System.out.println("\n");

        rs2.orderring("Platinum");


    }
}
