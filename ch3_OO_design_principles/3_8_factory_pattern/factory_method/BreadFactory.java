public class BreadFactory extends BakedGoodsFactory {

    public BakedGoods getBakedGoods() {
        return new Bread();
    }

}