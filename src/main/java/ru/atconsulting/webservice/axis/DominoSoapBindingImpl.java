/**
 * DominoSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.atconsulting.webservice.axis;

public class DominoSoapBindingImpl implements ru.atconsulting.webservice.axis.Integration{
    public String DOACTION(String ACTIVITYNAME, String SYSTEMID, javax.xml.rpc.holders.StringHolder DATASET, String DOCKEY) throws java.rmi.RemoteException {
        DATASET.value = "Dataset changed!";
        return "WWW";
    }

}
