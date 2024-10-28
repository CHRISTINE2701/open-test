public class magazine extends libraryitem{
    private string issuedate;
    public magazine (int id, string title, string issuedate){
        super (id,title);
        this.issuedate = issuedate;
    }
    @override
    public string getdetails(){
        return "issue date:" + issuedate;

    }
@override
public boolean isavailable(){
    return true; //magazines are always avaliable

}
}