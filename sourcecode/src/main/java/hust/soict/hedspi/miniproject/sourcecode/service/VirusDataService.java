package hust.soict.hedspi.miniproject.sourcecode.service;

import hust.soict.hedspi.miniproject.sourcecode.entity.Lipid.CoronaVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.Lipid.HivVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.Lipid.RotaVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.NonLipid.PolioVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.NonLipid.RhinoVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.Virus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;

import java.util.ArrayList;
import java.util.List;

public class VirusDataService {
    private static final VirusDataService instance = new VirusDataService();
    private final List<Virus> virusList = new ArrayList<>();

    private VirusDataService(){
        Virus covid = new CoronaVirus(
                "Virus Covid-19",
                "ARN",
                "Spike (S), Envelope (E), Membrane (M) và Nucleo capsid (N)",
                125,
                VirusShape.XOAN_OC,
                "https://biochain.vn/wp-content/uploads/2020/03/Coronavirus-anh-huong-den-nong-san-va-thuc-pham.jpg",
                "",
                ""
                );

        Virus rotavirus = new RotaVirus(
                "Virus rota",
                "ARN",
                "Capsid protein: VP2, VP4, VP6, VP7",
                70,
                VirusShape.HINH_CAU,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Rotavirus.jpg/280px-Rotavirus.jpg",
                "",
                "");

        Virus hivVirus = new HivVirus(
                "Virus HIV",
                "ARN",
                "Capsid protein: FEZ1 và BICD2", 120,
                VirusShape.HINH_CAU,
                "https://cdn.tgdd.vn/Files/2017/12/12/1049670/hiv-aids-1_800x522.jpg",
                "",
                "");

        Virus polioVirus = new PolioVirus(
                "Virus polio",
                "ARN", "Capsid protein:VP1, VP2, VP3, VP4",
                30,
                VirusShape.HINH_CAU,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Polio-3-chains.png/220px-Polio-3-chains.png"
        );

        Virus rhinoVirus = new RhinoVirus(
                "Rhino Virus",
                "ARN",
                "Capsid protein : VP1",
                50,
                VirusShape.XOAN_OC,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Rhinovirus.PNG/800px-Rhinovirus.PNG"
        );

        virusList.add(covid);
        virusList.add(rotavirus);
        virusList.add(hivVirus);
        virusList.add(polioVirus);
        virusList.add(rhinoVirus);
    }

    public static VirusDataService getInstance(){
        return instance;
    }

    public List<Virus> getVirusList(){
        return virusList;
    }
}
