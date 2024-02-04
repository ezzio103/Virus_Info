package hust.soict.hedspi.miniproject.sourcecode.entity;

public class LipidVirus extends Virus{
    private  String effect;
    private String typeOfLipid;

    public LipidVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL, String effect, String typeOfLipid) {
        super(name, acidNucleic, capsid, size, shape, imageURL);
        this.effect = effect;
        this.typeOfLipid = typeOfLipid;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getTypeOfLipid() {
        return typeOfLipid;
    }

    public void setTypeOfLipid(String typeOfLipid) {
        this.typeOfLipid = typeOfLipid;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Lipid effect: " + this.effect + ", lipid type: " + this.typeOfLipid;
    }

    @Override
    public String infect() {
        System.out.println("Enveloped virus infects a cell via endocytosis.");
        return super.infect();
    }
}
