package hust.soict.hedspi.miniproject.sourcecode.entity;

public enum VirusShape {
    XOAN_OC("Hình xoắn ốc"), HINH_CAU("Hình cầu"), HINH_PHONG_BI("Hình phong bì"), THAP_NHI_DIEN("Hình thập nhị diện - 12 mặt"), KHAC("Hình dạng khác");

    private final String shape;
    private VirusShape(String shape) {
        this.shape = shape;
    }

    public String getShape(){
        return this.shape;
    }
}
