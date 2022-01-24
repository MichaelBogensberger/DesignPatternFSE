package org.htlimst;

public abstract class IceCreamConeDecorator implements IceCreamCone
{
    private IceCreamCone iceCreamCone;
    public IceCreamConeDecorator(IceCreamCone iceCreamCone)
    {
        this.iceCreamCone = iceCreamCone;
    }
    @Override
    public String getFlavors()
    {
        return iceCreamCone.getFlavors();
    }
}
