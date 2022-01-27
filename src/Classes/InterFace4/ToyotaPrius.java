package Classes.InterFace4;

class ToyotaPrius extends Vehicle implements IEletric, IGas {

    public ToyotaPrius(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String drive() {
        return "toyota Prius";
    }

    @Override
    public String changeOil() {
        return "toyotaPrius change oil ";
    }

    @Override
    public String changeBattery() {
        return "toyota prius change battery";
    }
}
