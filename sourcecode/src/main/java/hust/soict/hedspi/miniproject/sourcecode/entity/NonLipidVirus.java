package hust.soict.hedspi.miniproject.sourcecode.entity;

public class NonLipidVirus extends Virus {

    public NonLipidVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL) {
        super(name, acidNucleic, capsid, size, shape, imageURL);
    }

    @Override
    public String infect() {
        System.out.println("Non-enveloped virus infects a cell by penetrating the cell membrane.");
        return super.infect();
    }

    @Override
    public String toString() {
        return super.toString() + ", is non-enveloped virus;";
    }
}
