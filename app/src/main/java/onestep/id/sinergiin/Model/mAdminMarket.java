package onestep.id.sinergiin.Model;

public class mAdminMarket {
    private String id, img, title, desc, pcs;

    public mAdminMarket(String id, String img, String title, String pcs,String desc) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.pcs = pcs;
        this.desc = desc;
    }

    public String getPcs() {
        return pcs;
    }

    public void setPcs(String pcs) {
        this.pcs = pcs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
