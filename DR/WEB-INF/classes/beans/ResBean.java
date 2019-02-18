package beans;

public class ResBean{
	private int res_id;
    private int thread_id;
    private String res_text;
    private String res_name;
    private int res_good;
    private String res_date;
    private int res_number;
	private int reply;

	 /**
     * @param thread_id the res_id to set
     */
    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }
    /**
     * @return the res_id
     */
    public int getRes_id() {
        return res_id;
    }
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
     * @param thread_name the res_text to set
     */
    public void setRes_text(String res_text) {
        this.res_text = res_text;
    }
    /**
     * @return the res_text
     */
    public String getRes_text() {
        return res_text;
    }
    /**
     * @param res_name the res_name to set
     */
    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }
    /**
     * @return the thread_date
     */
    public String getRes_name() {
        return res_name;
    }
    /**
     * @param res_good the res_good to set
     */
    public void setRes_good(int res_good) {
        this.res_good = res_good;
    }
    /**
     * @return the res_good
     */
    public int getRes_good() {
        return res_good;
    }
    /**
     * @param res_date the res_date to set
     */
    public void setRes_date(String res_date) {
        this.res_date = res_date;
    }
    /**
     * @return the res_date
     */
    public int getRes_date() {
        return res_date;
    }
    /**
     * @param res_number the res_number to set
     */
    public void setRes_number(int res_number) {
        this.res_number = res_number;
    }
    /**
     * @return the res_number
     */
    public int getRes_number() {
        return res_number;
    }
    /**
     * @param reply the reply to set
     */
    public void setReply(int reply) {
        this.reply = reply;
    }
    /**
     * @return the reply
     */
    public int getReply() {
        return reply;
    }

}

