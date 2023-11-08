import java.util.ArrayList;

public class Store {
    protected ArrayList<CISItem> items = new ArrayList<>();

    public void addBook(Book book){
        items.add(book);
    }

    public void addPhone(Phone phone){
        items.add(phone);
    }

    public void addMagazine(Magazine magazine){
        items.add(magazine);
    }

    public void addArduino(Arduino arduino){
        items.add(arduino);
    }

    public void updatePhonesLocation(String location){
        for(CISItem item: items){
            if(item instanceof Phone){
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        for(CISItem item: items){
            if(item instanceof Phone){
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> itemsOfType = new ArrayList<>();
        switch(itemType.toLowerCase()){
            case "phone":
                for(CISItem item: items){
                    if(item instanceof Phone){
                        itemsOfType.add(item);
                    }
                }
                break;
            case "magazine":
                for(CISItem item: items){
                    if(item instanceof Magazine){
                        itemsOfType.add(item);
                    }
                }
                break;
            case "book":
                for(CISItem item: items){
                    if(item instanceof Book){
                        itemsOfType.add(item);
                    }
                }
                break;
            case "arduino":
                for(CISItem item: items){
                    if(item instanceof Arduino){
                        itemsOfType.add(item);
                    }
                }
                break;
        }
        return itemsOfType;
    }

    public void updateItems(String itemType, String property, String value){
        ArrayList<CISItem> itemsOfType = getItems(itemType);
        switch(property.toLowerCase()){
            case "name":
                for (CISItem item: itemsOfType){
                    item.setName(value);
                }
                break;
            case "location":
                for (CISItem item: itemsOfType){
                    item.setLocation(value);
                }
                break;
            case "price":
                for (CISItem item: itemsOfType){
                    item.setPrice(Integer.parseInt(value));
                }
                break;
            case "description":
                for (CISItem item: itemsOfType){
                    item.setDescription(value);
                }
                break;
            case "wordcount":
                for (CISItem item: itemsOfType){
                    if (item instanceof ReadingItem){
                        ((ReadingItem) item).setWordCount(Integer.parseInt(value));
                    }
                }
                break;
            case "datepublished":
                for (CISItem item: itemsOfType){
                    if (item instanceof ReadingItem){
                        ((ReadingItem) item).setDatePublished(value);
                    }
                }
                break;
            case "author":
                for (CISItem item: itemsOfType){
                    if (item instanceof ReadingItem){
                        ((ReadingItem) item).setAuthor(value);
                    }
                }
                break;
            case "isbn":
                for (CISItem item: itemsOfType){
                    if (item instanceof Book){
                        ((Book) item).setIsbn(value);
                    }
                }
                break;
            case "edition":
                for (CISItem item: itemsOfType){
                    if (item instanceof Book){
                        ((Book) item).setEdition(value);
                    }
                }
                break;
            case "title":
                for (CISItem item: itemsOfType){
                    if (item instanceof Book){
                        ((Book) item).setTitle(value);
                    }
                }
                break;
            case "coverstorytitle":
                for (CISItem item: itemsOfType){
                    if (item instanceof Magazine){
                        ((Magazine) item).setCoverStoryTitle(value);
                    }
                }
                break;
            case "printdate":
                for (CISItem item: itemsOfType){
                    if (item instanceof Magazine){
                        ((Magazine) item).setPrintDate(value);
                    }
                }
                break;
            case "storagecapacity":
                for (CISItem item: itemsOfType){
                    if (item instanceof ElectronicItem){
                        ((ElectronicItem) item).setStorageCapacity(Integer.parseInt(value));
                    }
                }
                break;
            case "model":
                for (CISItem item: itemsOfType){
                    if (item instanceof ElectronicItem){
                        ((ElectronicItem) item).setModel(value);
                    }
                }
                break;
            case "maker":
                for (CISItem item: itemsOfType){
                    if (item instanceof ElectronicItem){
                        ((ElectronicItem) item).setMaker(value);
                    }
                }
                break;
            case "operatingsystem":
                for (CISItem item: itemsOfType){
                    if (item instanceof ElectronicItem){
                        ((ElectronicItem) item).setOperatingSystem(value);
                    }
                }
                break;
            case "networktype":
                for (CISItem item: itemsOfType){
                    if (item instanceof Phone){
                        ((Phone) item).setNetworkType(value);
                    }
                }
                break;
            case "screensize":
                for (CISItem item: itemsOfType){
                    if (item instanceof Phone){
                        ((Phone) item).setScreenSize(Integer.parseInt(value));
                    }
                }
                break;
            case "version":
                for (CISItem item: itemsOfType){
                    if (item instanceof Arduino){
                        ((Arduino) item).setVersion(value);
                    }
                }
                break;
        }
    }

    public void showAllInfo(){
        for (CISItem item: items) {
            System.out.println(item.toString());
        }
    }

}
