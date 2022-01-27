package Classes.InterFace4;

class Bus extends Vehicle implements IDiesel {
    public Bus(Model model, int modelYılı) {
        super(model, modelYılı);
    }

    public String drive() {
        return "bus drive";
    }

    public String changeDiesel() {
        return "bus change diesel";
    }

}
