package Lab3;

public class Shop {
    private Goods[] goods;

    public Shop(Goods[] list){
        goods = list;
    }

    public void printList(){
        for(Goods good: goods){
            System.out.println(good);
        }
    }

    public void printList(boolean isInStock){
        for(Goods good: goods){
            if(good.isInStock() == isInStock)
                System.out.println(good);
        }
    }

    public String findGoodByCategory(String category){
        String result = "";
        for(Goods good: goods){
            if(good.getCategory().contains(category))
                result += good.toString()+"\n"+
                        (good.isInStock()?"в наявності":"немає на складі") + "\n";
        }
        return result.isEmpty()?"нічого не знайдено":result;
    }

}
