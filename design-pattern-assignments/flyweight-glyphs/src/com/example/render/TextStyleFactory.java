
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TextStyleFactory {
    private static final Map<String, TextStyle> CACHE = new ConcurrentHashMap<>();

    public static TextStyle get(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + (bold ? "B" : "N");
        return CACHE.computeIfAbsent(key, k -> new TextStyle(font, size, bold));
    }

    public static int cacheSize() {
        return CACHE.size();
    }
}