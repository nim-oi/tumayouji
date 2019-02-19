package beans;

public class ThreadBean{
    private String thread_name;
    private String category;
    private String res_name;
    private String thread_text;

    public void setThreadNmae(String thread_name){
        this.thread_name = thread_name;
    }

    public String getThread_name(){
        return thread_name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setResName(String res_name){
        this.res_name = res_name;
    }

    public String getResName(){
        return res_name;
    }

    public void setResText(String thread_text){
        this.thread_text = thread_text;
    }

    public String getResText(){
        return thread_text;
    }
}