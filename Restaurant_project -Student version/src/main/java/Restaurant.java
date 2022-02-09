import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public boolean isRestaurantOpen() {
        return true;
        private static LocalTime opening_time=LocalTime.parse( "10:00" );
        private static LocalTime closing_time=LocalTime.parse( "21:30" );
    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    public List<String> getMenu() {
        List<String> list = new ArrayList<String>(List.of("Chicken pot pie","Mashed potatoes","Fried chicken","Burgers (with an option to add cheese/ bacon)",
                "Chicken soup","Meatloaf","Lasagna","Spaghetti with meatballs","Chicken burger","Chicken parmesan",
                "Chicken Pesto","Burger Sliders"));

        return list;
    }
    public boolean isOpen() {

        // get current time
        LocalTime now=LocalTime.now();

        System.out.println("Current time : "+now);

        //if current time is between opening and closing
        if(now.isAfter(opening_time) && now.isBefore(closing_time)) {
            return true;
        }
        else {
            return false;
        }
    }

}


    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

}
