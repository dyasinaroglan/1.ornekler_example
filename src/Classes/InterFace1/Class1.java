package Classes.InterFace1;

public class Class1 extends ParentClass implements InterFace,InterFace2{
    // HEM interface ile hem de InterFace2 ile implements edilebilir.
    //virgülle istediğim kadar implements yapabilirim. ama sadece bir defa extend yapabilirim.

    @Override
    public void yaz() {
        System.out.println("class 1 ");

    }

    public void yaz2() {

    }
}
