package hust.soict.hedspi.miniproject.sourcecode.entity.NonLipid;

import hust.soict.hedspi.miniproject.sourcecode.entity.NonLipidVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;

public class PolioVirus extends NonLipidVirus {

    public PolioVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL) {
        super(name, acidNucleic, capsid, size, shape, imageURL);
    }

    @Override
    public String toString() {
        return "Polio " + super.toString();
    }

    @Override
    public  String infect(){
        super.infect();
        return "src/main/resources/hust/soict/hedspi/miniproject/sourcecode/GUI/virus_details/PolioVirus Mechanism.mp4";
    }
}
