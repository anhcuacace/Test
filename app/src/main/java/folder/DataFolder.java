package folder;

public class DataFolder {
    private int anh,sua,xoa;
    String ten;

    public DataFolder(int anh, String ten, int sua, int xoa) {
        this.anh = anh;
        this.sua = sua;
        this.xoa = xoa;
        this.ten = ten;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getSua() {
        return sua;
    }

    public void setSua(int sua) {
        this.sua = sua;
    }

    public int getXoa() {
        return xoa;
    }

    public void setXoa(int xoa) {
        this.xoa = xoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
