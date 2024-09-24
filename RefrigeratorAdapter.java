public class RefrigeratorAdapter implements Outlet{
    
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn() {
        return refrigerator.startCooling();
    }
}
