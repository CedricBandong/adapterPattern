public class LaptopAdapter implements Outlet{
    
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }
}
