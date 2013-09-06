package com.buschmais.jqassistant.plugin.jpa2.impl.store;

import com.buschmais.jqassistant.core.model.api.descriptor.AbstractDescriptor;
import com.buschmais.jqassistant.core.model.api.descriptor.TypeDescriptor;

import java.util.HashSet;
import java.util.Set;

/**
 * A descriptor for JPA persistence descriptors.
 */
public class PersistenceDescriptor extends AbstractDescriptor {

    /**
     * The persistence units referenced by this persistence unit.
     */
    private Set<PersistenceUnitDescriptor> contains = new HashSet<>();

    public Set<PersistenceUnitDescriptor> getContains() {
        return contains;
    }

    public void setContains(Set<PersistenceUnitDescriptor> contains) {
        this.contains = contains;
    }
}
