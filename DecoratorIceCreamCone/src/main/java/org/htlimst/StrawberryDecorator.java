package org.htlimst;

public class StrawberryDecorator extends IceCreamConeDecorator
{
    public StrawberryDecorator(IceCreamCone iceCreamCone)
    {
        super(iceCreamCone);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Strawberry";
    }
}
