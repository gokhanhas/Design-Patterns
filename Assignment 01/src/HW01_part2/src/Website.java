import java.util.ArrayList;

/**
 * This is the Website class.
 */
public class Website implements Websites{
    /**
     * Keeps the subsribers list.
     */
    private ArrayList<Subscriber> subsribers;
    /**
     * Keeps the changed content.
     */
    private int[] content;

    /**
     * Keeps the number of changed content.
     */
    private int number_of_changed_content;

    private String photos;
    private String texts;
    private String audios;

    /**
     * Changed content funtion.
     */
    public void changedContent() {

    }

    @Override
    public void registerSubscriber() {

    }

    @Override
    public void removeSubscriber() {

    }

    @Override
    public void notifySubscriber() {

    }

    /**
     *
     * @return the content.
     */
    public int[] getContent() {
        return content;
    }

    /**
     *
     * @param content
     */
    public void setContent(int[] content) {
        this.content = content;
    }

    /**
     *
     * @return
     */
    public int getNumber_of_changed_content() {
        return number_of_changed_content;
    }

    /**
     *
     * @param number_of_changed_content
     */
    public void setNumber_of_changed_content(int number_of_changed_content) {
        this.number_of_changed_content = number_of_changed_content;
    }

    /**
     *
     * @return
     */
    public ArrayList<Subscriber> getSubsribers() {
        return subsribers;
    }

    /**
     *
     * @param subsribers
     */
    public void setSubsribers(ArrayList<Subscriber> subsribers) {
        this.subsribers = subsribers;
    }

    /**
     *
     * @return
     */
    public String getPhotos() {
        return photos;
    }

    /**
     *
     * @return
     */
    public String getTexts() {
        return texts;
    }

    /**
     *
     * @return
     */
    public String getAudios() {
        return audios;
    }

}
