package beans;

public class ThreadBean{
    private String threadname;
    private String category;
    private String username;
    private String threadtext;
    private String threadid;
    private String threaddate;

    public void setThreadname(String threadname){
        this.threadname = threadname;
    }

    public String getThreadname(){
        return threadname;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setThreadtext(String threadtext){
        this.threadtext = threadtext;
    }

    public String getThreadtext(){
        return threadtext;
    }

    public void setThreadid(String threadid){
        this.threadid = threadid;
    }

    public String getThreadid(){
        return threadid;
    }

    public void setThreaddate(String threaddate){
        this.threaddate = threaddate;
    }

    public String getThreaddate(){
        return threaddate;
    }

}