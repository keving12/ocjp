class Product<X> { }

public class FoodProduct<Y> extends Product<X> { }

// This class will not compile - Product will not know what FoodProduct's type information is