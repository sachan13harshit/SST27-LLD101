public class SlackDecorator implements Notifier {
    private final Notifier notifier;
    private final String channelId;

    public SlackDecorator(Notifier notifier, String channelId) {
        this.notifier = notifier;
        this.channelId = channelId;
    }

    @Override
    public void notify(String text) {
        notifier.notify(text);
        System.out.println("[Slack -> " + channelId + "]: " + text);
    }
}