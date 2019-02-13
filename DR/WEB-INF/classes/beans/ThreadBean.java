package beans;

public class ThreadBean{
    private int thread_id;
    private String thread_name;
    private String thread_date;
    private int thread_fav;
    private int s_category_id;
    private int user_id;

    /**
     * @param thread_id the thread_id to set
     */
    public void setThread_id(int thread_id) {
        this.thread_id = thread_id;
    }
    /**
     * @return the thread_id
     */
    public int getThread_id() {
        return thread_id;
    }
    /**
     * @param thread_name the thread_name to set
     */
    public void setThread_name(String thread_name) {
        this.thread_name = thread_name;
    }
    /**
     * @return the thread_name
     */
    public String getThread_name() {
        return thread_name;
    }
    /**
     * @param thread_date the thread_date to set
     */
    public void setThread_date(String thread_date) {
        this.thread_date = thread_date;
    }
    /**
     * @return the thread_date
     */
    public String getThread_date() {
        return thread_date;
    }
    /**
     * @param thread_fav the thread_fav to set
     */
    public void setThread_fav(int thread_fav) {
        this.thread_fav = thread_fav;
    }
    /**
     * @return the thread_fav
     */
    public int getThread_fav() {
        return thread_fav;
    }
    /**
     * @param s_category_id the s_category_id to set
     */
    public void setS_category_id(int s_category_id) {
        this.s_category_id = s_category_id;
    }
    /**
     * @return the s_category_id
     */
    public int getS_category_id() {
        return s_category_id;
    }
    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

}

