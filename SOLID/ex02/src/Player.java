public class Player implements Playable {
    private Frame last;

    public void play(byte[] fileBytes) {
        Frame f = new Frame(fileBytes);
        last = f;

        System.out.println("\u25B6 plays " + fileBytes.length + " bytes");
        System.out.println("Caching last frame? " + (last!=null));
    }
}