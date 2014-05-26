package org.drools.compiler.factmodel.traits;

/**
 */
public class ProviderImpl implements Provider {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
