package org.htlimst;

public class ChocolateDecorator extends IceCreamConeDecorator
{
    public ChocolateDecorator(IceCreamCone iceCreamCone)
    {
        super(iceCreamCone);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Chocolate";
    }
}
