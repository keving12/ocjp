public class ApplePieFactory extends BakedGoodsFactory {
    
    public BakedGoods getBakedGoods() {
        return new ApplePie();
    }

}