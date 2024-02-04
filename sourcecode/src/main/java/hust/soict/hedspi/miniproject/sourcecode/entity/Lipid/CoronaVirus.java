package hust.soict.hedspi.miniproject.sourcecode.entity.Lipid;

import hust.soict.hedspi.miniproject.sourcecode.entity.LipidVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;

public class CoronaVirus extends LipidVirus {
    public CoronaVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL, String effect, String typeOfLipid) {
        super(name, acidNucleic, capsid, size, shape, imageURL, effect, typeOfLipid);
    }

    @Override
    public String infect() {
        super.infect();
        return "src/main/resources/hust/soict/hedspi/miniproject/sourcecode/GUI/virus_details/Coronavirus Mechanism.mp4";
    }

    @Override
    public String toString() {
        return "Corona " + super.toString();
    }
}
