package org.drools.compiler.factmodel.traits;

/**
 */
public class ProcedureImpl implements Procedure {

    private PatientImpl patient;
    private ProviderImpl provider;

    @Override
    public Patient getSubject() {
        return this.patient;
    }

    @Override
    public Provider getProvider() {
        return this.provider;
    }

    public void setPatient(PatientImpl patient) {
        this.patient = patient;
    }

    public void setProvider(ProviderImpl provider) {
        this.provider = provider;
    }

}
