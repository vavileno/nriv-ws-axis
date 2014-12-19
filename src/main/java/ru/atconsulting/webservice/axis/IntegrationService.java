/**
 * IntegrationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.atconsulting.webservice.axis;

public interface IntegrationService extends javax.xml.rpc.Service {
    public String getDominoAddress();

    public Integration getDomino() throws javax.xml.rpc.ServiceException;

    public Integration getDomino(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
