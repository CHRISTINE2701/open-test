public class book extends libraryitem
implements borrowable{
private string author;
private string isbn;
private boolean isborrowed;
public book (int id, string title, string author, string isbn){ 
super (id, title);
this.author=author;
this.isbn=isbn;
this. borrowed=false;
}
@override
public string getdetails(){
return "Author:" + author + ",ISBN:" + isbn;
}
@override
public void borrow(){
    if(isavailable()){
        isborrowed = true;
        system.out.println("book borrowed successfully.");
    }else {
        system.out.println("book is already borrowed.");
    }
}
@override
public void returnitem(){
    if (!isavailable()) {
        isborrowed = false;
        system.out.println("book returned successfully.");
    }else{
        system.out.println("book is already avaliable.");
    }
    }
}