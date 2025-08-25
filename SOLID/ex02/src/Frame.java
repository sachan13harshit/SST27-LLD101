public class Frame { 
    private byte[] data;

    public Frame(byte[] d) {
        this.data = d;
    }

    public byte[] getData() {
        return data;
    }
}