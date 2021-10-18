package CreationalPattern.Builder;

abstract class Builder {
    public abstract void BuilderPartA();
    public abstract void BuildPartB();

    public abstract Product GetResult();

}

class ConcreteBuilder1 extends Builder{
    private Product product=new Product();
    @Override
    public void BuilderPartA() {
        product.Add("part 1A");
    }

    @Override
    public void BuildPartB() {
        product.Add("part 1B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
class ConcreteBuilder2 extends Builder{
    private Product product=new Product();
    @Override
    public void BuilderPartA() {
        product.Add("part 2A");
    }

    @Override
    public void BuildPartB() {
        product.Add("part 2B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}

class Director{
    public void construct(Builder builder){
        builder.BuilderPartA();
        builder.BuildPartB();
    }
}