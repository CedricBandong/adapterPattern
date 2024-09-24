public class SmartphoneAdapter implements Outlet {
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger){
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn() {
        return smartphoneCharger.chargePhone();
    }
}
