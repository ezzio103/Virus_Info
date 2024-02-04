package hust.soict.hedspi.miniproject.sourcecode.entity.NonLipid;

import hust.soict.hedspi.miniproject.sourcecode.entity.NonLipidVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;

public class RhinoVirus extends NonLipidVirus {
    private String receptorBinding; // kết nối với receptor

    public RhinoVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL) {
        super(name, acidNucleic, capsid, size, shape, imageURL);
    }


    public String getReceptorBinding() {
        return receptorBinding;
    }

    public void setReceptorBinding(String receptorBinding) {
        this.receptorBinding = receptorBinding;
    }

    @Override
    public String toString() {
        return "RhinoVirus " + super.toString() ;
    }
    @Override
    public  String infect(){
        super.infect();
        return "src/main/resources/hust/soict/hedspi/miniproject/sourcecode/GUI/virus_details/RhinoVirusMechanism.mp4";
    }
}
