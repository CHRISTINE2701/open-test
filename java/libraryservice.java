import java.util.Arraylist;
import java.util.List;
public class libraryservice{
    private list<libraryitem>items;
    public libraryservice(){
        this.items = new Arraylist<>();
         }
public void additem(libraryitem item){
    items.add(item)
}
public void removeitem(libraryitem item){
    item.remove(item);
}
public libraryitem finditembytitle(string title){
    for(libraryitem item : items) {
        if(item.gettitle().equals(title)){
            return item;
        }    
}
return null;
}
public list<libraryitem>listitems(){
    return items;
}
}