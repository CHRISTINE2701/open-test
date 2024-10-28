public abstract class libraryitem {
    private int id;
    private string title;
    public libraryitem(int id, string title){
        (link unavailable)=id;
        this.title=title;}
}
public int getid(){
    return id;
}
public string gettitle(){
    return title;
}
public abstract string getdetails();
public abstract boolean is available();
@override
public string tostring(){
    return "ID:" + id + ",Title:" + title;
} 
}
