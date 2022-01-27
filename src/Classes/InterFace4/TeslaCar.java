package Classes.InterFace4;

class TeslaCar extends Vehicle implements IEletric {
    public TeslaCar(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String drive() {
        return "tesla car drive";
    }

    @Override
    public String changeBattery() {
        return "tesla car change battery";
    }
}
