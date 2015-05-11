public abstract class BakedGoodsFactory {

    public BakedGoods getBakedGoods {
        BakedGoods bg = getBakedGoods();
        return bg;
    }
    
    public abstract BakedGoods getBakedGoods();


}