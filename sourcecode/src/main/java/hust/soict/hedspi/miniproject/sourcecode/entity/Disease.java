package hust.soict.hedspi.miniproject.sourcecode.entity;

import java.util.List;

public class Disease {
    private String name;
    private String host; // Vật chủ bị lây bệnh (con người, động vật, thực vật, ...)
    private List<String> symptomImageLinks; // Danh sách các triệu chứng

    public Disease(){

    }

    public Disease(String name, String host, List<String> symptomImageLinks) {
        this.name = name;
        this.host = host;
        this.symptomImageLinks = symptomImageLinks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<String> getSymptomImageLinks() {
        return symptomImageLinks;
    }

    public void setSymptomImageLinks(List<String> symptomImageLinks) {
        this.symptomImageLinks = symptomImageLinks;
    }
}
