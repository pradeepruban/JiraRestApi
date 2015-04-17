/**
 * JirasoapserviceV2SoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atlassian.jira.rpc.soap.jirasoapservice_v2;

public class JirasoapserviceV2SoapBindingSkeleton implements com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService, org.apache.axis.wsdl.Skeleton {
    private com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"), com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteScheme"), com.atlassian.jira.rpc.soap.beans.RemoteScheme.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in8"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteScheme"), com.atlassian.jira.rpc.soap.beans.RemoteScheme.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createProject", _params, new javax.xml.namespace.QName("", "createProjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createProject") == null) {
            _myOperations.put("createProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateProject", _params, new javax.xml.namespace.QName("", "updateProjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateProject") == null) {
            _myOperations.put("updateProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectByKey", _params, new javax.xml.namespace.QName("", "getProjectByKeyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectByKey"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectByKey") == null) {
            _myOperations.put("getProjectByKey", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectByKey")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSecurityLevel", _params, new javax.xml.namespace.QName("", "getSecurityLevelReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteSecurityLevel"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSecurityLevel"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSecurityLevel") == null) {
            _myOperations.put("getSecurityLevel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSecurityLevel")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"), com.atlassian.jira.rpc.soap.beans.RemoteGroup.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"), com.atlassian.jira.rpc.soap.beans.RemoteUser.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addUserToGroup", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addUserToGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addUserToGroup") == null) {
            _myOperations.put("addUserToGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addUserToGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"), com.atlassian.jira.rpc.soap.beans.RemoteGroup.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"), com.atlassian.jira.rpc.soap.beans.RemoteUser.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeUserFromGroup", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "removeUserFromGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeUserFromGroup") == null) {
            _myOperations.put("removeUserFromGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeUserFromGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"), com.atlassian.jira.rpc.soap.beans.RemoteUser.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateUser", _params, new javax.xml.namespace.QName("", "updateUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateUser") == null) {
            _myOperations.put("updateUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateUser")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteFieldValue"), com.atlassian.jira.rpc.soap.beans.RemoteFieldValue[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateIssue", _params, new javax.xml.namespace.QName("", "updateIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateIssue") == null) {
            _myOperations.put("updateIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteIssue", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteIssue") == null) {
            _myOperations.put("deleteIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAvailableActions", _params, new javax.xml.namespace.QName("", "getAvailableActionsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteNamedObject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getAvailableActions"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAvailableActions") == null) {
            _myOperations.put("getAvailableActions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAvailableActions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssue", _params, new javax.xml.namespace.QName("", "getIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssue") == null) {
            _myOperations.put("getIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"), com.atlassian.jira.rpc.soap.beans.RemoteIssue.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createIssue", _params, new javax.xml.namespace.QName("", "createIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createIssue") == null) {
            _myOperations.put("createIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteComment"), com.atlassian.jira.rpc.soap.beans.RemoteComment.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addComment", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addComment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addComment") == null) {
            _myOperations.put("addComment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addComment")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeAllRoleActorsByProject", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "removeAllRoleActorsByProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeAllRoleActorsByProject") == null) {
            _myOperations.put("removeAllRoleActorsByProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeAllRoleActorsByProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPriorities", _params, new javax.xml.namespace.QName("", "getPrioritiesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemotePriority"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getPriorities"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPriorities") == null) {
            _myOperations.put("getPriorities", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPriorities")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getResolutions", _params, new javax.xml.namespace.QName("", "getResolutionsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteResolution"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getResolutions"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getResolutions") == null) {
            _myOperations.put("getResolutions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getResolutions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssueTypes", _params, new javax.xml.namespace.QName("", "getIssueTypesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssueType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssueTypes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssueTypes") == null) {
            _myOperations.put("getIssueTypes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssueTypes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSubTaskIssueTypes", _params, new javax.xml.namespace.QName("", "getSubTaskIssueTypesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssueType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSubTaskIssueTypes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSubTaskIssueTypes") == null) {
            _myOperations.put("getSubTaskIssueTypes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSubTaskIssueTypes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStatuses", _params, new javax.xml.namespace.QName("", "getStatusesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteStatus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getStatuses"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStatuses") == null) {
            _myOperations.put("getStatuses", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStatuses")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCustomFields", _params, new javax.xml.namespace.QName("", "getCustomFieldsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteField"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getCustomFields"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCustomFields") == null) {
            _myOperations.put("getCustomFields", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCustomFields")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteComment"), com.atlassian.jira.rpc.soap.beans.RemoteComment.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("editComment", _params, new javax.xml.namespace.QName("", "editCommentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteComment"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "editComment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("editComment") == null) {
            _myOperations.put("editComment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("editComment")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectRole", _params, new javax.xml.namespace.QName("", "getProjectRoleReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectRole") == null) {
            _myOperations.put("getProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectRoleActors", _params, new javax.xml.namespace.QName("", "getProjectRoleActorsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRoleActors"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectRoleActors"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectRoleActors") == null) {
            _myOperations.put("getProjectRoleActors", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectRoleActors")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDefaultRoleActors", _params, new javax.xml.namespace.QName("", "getDefaultRoleActorsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteRoleActors"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getDefaultRoleActors"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDefaultRoleActors") == null) {
            _myOperations.put("getDefaultRoleActors", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDefaultRoleActors")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeAllRoleActorsByNameAndType", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "removeAllRoleActorsByNameAndType"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeAllRoleActorsByNameAndType") == null) {
            _myOperations.put("removeAllRoleActorsByNameAndType", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeAllRoleActorsByNameAndType")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectRoles", _params, new javax.xml.namespace.QName("", "getProjectRolesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteProjectRole"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectRoles"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectRoles") == null) {
            _myOperations.put("getProjectRoles", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectRoles")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteProjectRole") == null) {
            _myOperations.put("deleteProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateProjectRole") == null) {
            _myOperations.put("updateProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createProjectRole", _params, new javax.xml.namespace.QName("", "createProjectRoleReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createProjectRole") == null) {
            _myOperations.put("createProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("isProjectRoleNameUnique", _params, new javax.xml.namespace.QName("", "isProjectRoleNameUniqueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "isProjectRoleNameUnique"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("isProjectRoleNameUnique") == null) {
            _myOperations.put("isProjectRoleNameUnique", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("isProjectRoleNameUnique")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addActorsToProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addActorsToProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addActorsToProjectRole") == null) {
            _myOperations.put("addActorsToProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addActorsToProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeActorsFromProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "removeActorsFromProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeActorsFromProjectRole") == null) {
            _myOperations.put("removeActorsFromProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeActorsFromProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addDefaultActorsToProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addDefaultActorsToProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addDefaultActorsToProjectRole") == null) {
            _myOperations.put("addDefaultActorsToProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addDefaultActorsToProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeDefaultActorsFromProjectRole", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "removeDefaultActorsFromProjectRole"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeDefaultActorsFromProjectRole") == null) {
            _myOperations.put("removeDefaultActorsFromProjectRole", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeDefaultActorsFromProjectRole")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAssociatedNotificationSchemes", _params, new javax.xml.namespace.QName("", "getAssociatedNotificationSchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getAssociatedNotificationSchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAssociatedNotificationSchemes") == null) {
            _myOperations.put("getAssociatedNotificationSchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAssociatedNotificationSchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProjectRole"), com.atlassian.jira.rpc.soap.beans.RemoteProjectRole.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAssociatedPermissionSchemes", _params, new javax.xml.namespace.QName("", "getAssociatedPermissionSchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getAssociatedPermissionSchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAssociatedPermissionSchemes") == null) {
            _myOperations.put("getAssociatedPermissionSchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAssociatedPermissionSchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteProject", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteProject") == null) {
            _myOperations.put("deleteProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectById", _params, new javax.xml.namespace.QName("", "getProjectByIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectById"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectById") == null) {
            _myOperations.put("getProjectById", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectById")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getVersions", _params, new javax.xml.namespace.QName("", "getVersionsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteVersion"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getVersions"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getVersions") == null) {
            _myOperations.put("getVersions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getVersions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getComments", _params, new javax.xml.namespace.QName("", "getCommentsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteComment"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getComments"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getComments") == null) {
            _myOperations.put("getComments", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getComments")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getWorklogs", _params, new javax.xml.namespace.QName("", "getWorklogsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteWorklog"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getWorklogs"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getWorklogs") == null) {
            _myOperations.put("getWorklogs", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getWorklogs")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFavouriteFilters", _params, new javax.xml.namespace.QName("", "getFavouriteFiltersReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteFilter"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getFavouriteFilters"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFavouriteFilters") == null) {
            _myOperations.put("getFavouriteFilters", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFavouriteFilters")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteVersion"), com.atlassian.jira.rpc.soap.beans.RemoteVersion.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("releaseVersion", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "releaseVersion"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("releaseVersion") == null) {
            _myOperations.put("releaseVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("releaseVersion")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("archiveVersion", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "archiveVersion"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("archiveVersion") == null) {
            _myOperations.put("archiveVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("archiveVersion")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFieldsForCreate", _params, new javax.xml.namespace.QName("", "getFieldsForCreateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteField"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getFieldsForCreate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFieldsForCreate") == null) {
            _myOperations.put("getFieldsForCreate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFieldsForCreate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFieldsForEdit", _params, new javax.xml.namespace.QName("", "getFieldsForEditReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteField"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getFieldsForEdit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFieldsForEdit") == null) {
            _myOperations.put("getFieldsForEdit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFieldsForEdit")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssueTypesForProject", _params, new javax.xml.namespace.QName("", "getIssueTypesForProjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssueType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssueTypesForProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssueTypesForProject") == null) {
            _myOperations.put("getIssueTypesForProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssueTypesForProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSubTaskIssueTypesForProject", _params, new javax.xml.namespace.QName("", "getSubTaskIssueTypesForProjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssueType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSubTaskIssueTypesForProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSubTaskIssueTypesForProject") == null) {
            _myOperations.put("getSubTaskIssueTypesForProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSubTaskIssueTypesForProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"), com.atlassian.jira.rpc.soap.beans.RemoteGroup.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateGroup", _params, new javax.xml.namespace.QName("", "updateGroupReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateGroup") == null) {
            _myOperations.put("updateGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUser", _params, new javax.xml.namespace.QName("", "getUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUser") == null) {
            _myOperations.put("getUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUser")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"), com.atlassian.jira.rpc.soap.beans.RemoteIssue.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createIssueWithSecurityLevel", _params, new javax.xml.namespace.QName("", "createIssueWithSecurityLevelReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createIssueWithSecurityLevel"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createIssueWithSecurityLevel") == null) {
            _myOperations.put("createIssueWithSecurityLevel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createIssueWithSecurityLevel")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addWorklogAndAutoAdjustRemainingEstimate", _params, new javax.xml.namespace.QName("", "addWorklogAndAutoAdjustRemainingEstimateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addWorklogAndAutoAdjustRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addWorklogAndAutoAdjustRemainingEstimate") == null) {
            _myOperations.put("addWorklogAndAutoAdjustRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addWorklogAndAutoAdjustRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addWorklogAndRetainRemainingEstimate", _params, new javax.xml.namespace.QName("", "addWorklogAndRetainRemainingEstimateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addWorklogAndRetainRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addWorklogAndRetainRemainingEstimate") == null) {
            _myOperations.put("addWorklogAndRetainRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addWorklogAndRetainRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteWorklogAndAutoAdjustRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteWorklogAndAutoAdjustRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteWorklogAndAutoAdjustRemainingEstimate") == null) {
            _myOperations.put("deleteWorklogAndAutoAdjustRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteWorklogAndAutoAdjustRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteWorklogAndRetainRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteWorklogAndRetainRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteWorklogAndRetainRemainingEstimate") == null) {
            _myOperations.put("deleteWorklogAndRetainRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteWorklogAndRetainRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteWorklogWithNewRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteWorklogWithNewRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteWorklogWithNewRemainingEstimate") == null) {
            _myOperations.put("deleteWorklogWithNewRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteWorklogWithNewRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateWorklogAndAutoAdjustRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateWorklogAndAutoAdjustRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateWorklogAndAutoAdjustRemainingEstimate") == null) {
            _myOperations.put("updateWorklogAndAutoAdjustRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateWorklogAndAutoAdjustRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateWorklogAndRetainRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateWorklogAndRetainRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateWorklogAndRetainRemainingEstimate") == null) {
            _myOperations.put("updateWorklogAndRetainRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateWorklogAndRetainRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateWorklogWithNewRemainingEstimate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "updateWorklogWithNewRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateWorklogWithNewRemainingEstimate") == null) {
            _myOperations.put("updateWorklogWithNewRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateWorklogWithNewRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("hasPermissionToCreateWorklog", _params, new javax.xml.namespace.QName("", "hasPermissionToCreateWorklogReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "hasPermissionToCreateWorklog"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("hasPermissionToCreateWorklog") == null) {
            _myOperations.put("hasPermissionToCreateWorklog", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("hasPermissionToCreateWorklog")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("hasPermissionToDeleteWorklog", _params, new javax.xml.namespace.QName("", "hasPermissionToDeleteWorklogReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "hasPermissionToDeleteWorklog"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("hasPermissionToDeleteWorklog") == null) {
            _myOperations.put("hasPermissionToDeleteWorklog", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("hasPermissionToDeleteWorklog")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("hasPermissionToUpdateWorklog", _params, new javax.xml.namespace.QName("", "hasPermissionToUpdateWorklogReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "hasPermissionToUpdateWorklog"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("hasPermissionToUpdateWorklog") == null) {
            _myOperations.put("hasPermissionToUpdateWorklog", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("hasPermissionToUpdateWorklog")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getResolutionDateByKey", _params, new javax.xml.namespace.QName("", "getResolutionDateByKeyReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getResolutionDateByKey"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getResolutionDateByKey") == null) {
            _myOperations.put("getResolutionDateByKey", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getResolutionDateByKey")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getResolutionDateById", _params, new javax.xml.namespace.QName("", "getResolutionDateByIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getResolutionDateById"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getResolutionDateById") == null) {
            _myOperations.put("getResolutionDateById", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getResolutionDateById")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAllPermissions", _params, new javax.xml.namespace.QName("", "getAllPermissionsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemotePermission"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getAllPermissions"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAllPermissions") == null) {
            _myOperations.put("getAllPermissions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAllPermissions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteComment"), com.atlassian.jira.rpc.soap.beans.RemoteComment.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("hasPermissionToEditComment", _params, new javax.xml.namespace.QName("", "hasPermissionToEditCommentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "hasPermissionToEditComment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("hasPermissionToEditComment") == null) {
            _myOperations.put("hasPermissionToEditComment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("hasPermissionToEditComment")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFieldsForAction", _params, new javax.xml.namespace.QName("", "getFieldsForActionReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteField"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getFieldsForAction"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFieldsForAction") == null) {
            _myOperations.put("getFieldsForAction", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFieldsForAction")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteFieldValue"), com.atlassian.jira.rpc.soap.beans.RemoteFieldValue[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("progressWorkflowAction", _params, new javax.xml.namespace.QName("", "progressWorkflowActionReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "progressWorkflowAction"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("progressWorkflowAction") == null) {
            _myOperations.put("progressWorkflowAction", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("progressWorkflowAction")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssueById", _params, new javax.xml.namespace.QName("", "getIssueByIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssueById"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssueById") == null) {
            _myOperations.put("getIssueById", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssueById")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_base64Binary"), byte[][].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addAttachmentsToIssue", _params, new javax.xml.namespace.QName("", "addAttachmentsToIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addAttachmentsToIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addAttachmentsToIssue") == null) {
            _myOperations.put("addAttachmentsToIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addAttachmentsToIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAttachmentsFromIssue", _params, new javax.xml.namespace.QName("", "getAttachmentsFromIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteAttachment"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getAttachmentsFromIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAttachmentsFromIssue") == null) {
            _myOperations.put("getAttachmentsFromIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAttachmentsFromIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"), com.atlassian.jira.rpc.soap.beans.RemoteWorklog.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addWorklogWithNewRemainingEstimate", _params, new javax.xml.namespace.QName("", "addWorklogWithNewRemainingEstimateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteWorklog"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addWorklogWithNewRemainingEstimate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addWorklogWithNewRemainingEstimate") == null) {
            _myOperations.put("addWorklogWithNewRemainingEstimate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addWorklogWithNewRemainingEstimate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectWithSchemesById", _params, new javax.xml.namespace.QName("", "getProjectWithSchemesByIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectWithSchemesById"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectWithSchemesById") == null) {
            _myOperations.put("getProjectWithSchemesById", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectWithSchemesById")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectAvatars", _params, new javax.xml.namespace.QName("", "getProjectAvatarsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteAvatar"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectAvatars"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectAvatars") == null) {
            _myOperations.put("getProjectAvatars", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectAvatars")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setProjectAvatar", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "setProjectAvatar"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setProjectAvatar") == null) {
            _myOperations.put("setProjectAvatar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setProjectAvatar")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectAvatar", _params, new javax.xml.namespace.QName("", "getProjectAvatarReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteAvatar"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectAvatar"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectAvatar") == null) {
            _myOperations.put("getProjectAvatar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectAvatar")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteProjectAvatar", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteProjectAvatar"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteProjectAvatar") == null) {
            _myOperations.put("deleteProjectAvatar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteProjectAvatar")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPermissionSchemes", _params, new javax.xml.namespace.QName("", "getPermissionSchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemotePermissionScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getPermissionSchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPermissionSchemes") == null) {
            _myOperations.put("getPermissionSchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPermissionSchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createPermissionScheme", _params, new javax.xml.namespace.QName("", "createPermissionSchemeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createPermissionScheme"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createPermissionScheme") == null) {
            _myOperations.put("createPermissionScheme", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createPermissionScheme")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deletePermissionScheme", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deletePermissionScheme"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deletePermissionScheme") == null) {
            _myOperations.put("deletePermissionScheme", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deletePermissionScheme")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"), com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermission"), com.atlassian.jira.rpc.soap.beans.RemotePermission.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteEntity"), com.atlassian.jira.rpc.soap.beans.RemoteEntity.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addPermissionTo", _params, new javax.xml.namespace.QName("", "addPermissionToReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addPermissionTo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addPermissionTo") == null) {
            _myOperations.put("addPermissionTo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addPermissionTo")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"), com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermission"), com.atlassian.jira.rpc.soap.beans.RemotePermission.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteEntity"), com.atlassian.jira.rpc.soap.beans.RemoteEntity.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deletePermissionFrom", _params, new javax.xml.namespace.QName("", "deletePermissionFromReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemotePermissionScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deletePermissionFrom"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deletePermissionFrom") == null) {
            _myOperations.put("deletePermissionFrom", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deletePermissionFrom")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getNotificationSchemes", _params, new javax.xml.namespace.QName("", "getNotificationSchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getNotificationSchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getNotificationSchemes") == null) {
            _myOperations.put("getNotificationSchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getNotificationSchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssueCountForFilter", _params, new javax.xml.namespace.QName("", "getIssueCountForFilterReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssueCountForFilter"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssueCountForFilter") == null) {
            _myOperations.put("getIssueCountForFilter", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssueCountForFilter")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromTextSearch", _params, new javax.xml.namespace.QName("", "getIssuesFromTextSearchReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromTextSearch"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromTextSearch") == null) {
            _myOperations.put("getIssuesFromTextSearch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromTextSearch")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromTextSearchWithProject", _params, new javax.xml.namespace.QName("", "getIssuesFromTextSearchWithProjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromTextSearchWithProject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromTextSearchWithProject") == null) {
            _myOperations.put("getIssuesFromTextSearchWithProject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromTextSearchWithProject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromJqlSearch", _params, new javax.xml.namespace.QName("", "getIssuesFromJqlSearchReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromJqlSearch"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromJqlSearch") == null) {
            _myOperations.put("getIssuesFromJqlSearch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromJqlSearch")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteUser", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteUser") == null) {
            _myOperations.put("deleteUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteUser")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"), com.atlassian.jira.rpc.soap.beans.RemoteUser.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setUserPassword", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "setUserPassword"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setUserPassword") == null) {
            _myOperations.put("setUserPassword", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setUserPassword")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteGroup", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "deleteGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteGroup") == null) {
            _myOperations.put("deleteGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("refreshCustomFields", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "refreshCustomFields"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("refreshCustomFields") == null) {
            _myOperations.put("refreshCustomFields", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("refreshCustomFields")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getProjectsNoSchemes", _params, new javax.xml.namespace.QName("", "getProjectsNoSchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getProjectsNoSchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProjectsNoSchemes") == null) {
            _myOperations.put("getProjectsNoSchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProjectsNoSchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteVersion"), com.atlassian.jira.rpc.soap.beans.RemoteVersion.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addVersion", _params, new javax.xml.namespace.QName("", "addVersionReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteVersion"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addVersion"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addVersion") == null) {
            _myOperations.put("addVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addVersion")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSavedFilters", _params, new javax.xml.namespace.QName("", "getSavedFiltersReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteFilter"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSavedFilters"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSavedFilters") == null) {
            _myOperations.put("getSavedFilters", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSavedFilters")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"), com.atlassian.jira.rpc.soap.beans.RemoteIssue.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createIssueWithParent", _params, new javax.xml.namespace.QName("", "createIssueWithParentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createIssueWithParent"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createIssueWithParent") == null) {
            _myOperations.put("createIssueWithParent", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createIssueWithParent")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"), com.atlassian.jira.rpc.soap.beans.RemoteIssue.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createIssueWithParentWithSecurityLevel", _params, new javax.xml.namespace.QName("", "createIssueWithParentWithSecurityLevelReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createIssueWithParentWithSecurityLevel"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createIssueWithParentWithSecurityLevel") == null) {
            _myOperations.put("createIssueWithParentWithSecurityLevel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createIssueWithParentWithSecurityLevel")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addBase64EncodedAttachmentsToIssue", _params, new javax.xml.namespace.QName("", "addBase64EncodedAttachmentsToIssueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "addBase64EncodedAttachmentsToIssue"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addBase64EncodedAttachmentsToIssue") == null) {
            _myOperations.put("addBase64EncodedAttachmentsToIssue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addBase64EncodedAttachmentsToIssue")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"), com.atlassian.jira.rpc.soap.beans.RemoteProject.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createProjectFromObject", _params, new javax.xml.namespace.QName("", "createProjectFromObjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteProject"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createProjectFromObject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createProjectFromObject") == null) {
            _myOperations.put("createProjectFromObject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createProjectFromObject")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSecuritySchemes", _params, new javax.xml.namespace.QName("", "getSecuritySchemesReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteScheme"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSecuritySchemes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSecuritySchemes") == null) {
            _myOperations.put("getSecuritySchemes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSecuritySchemes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromFilter", _params, new javax.xml.namespace.QName("", "getIssuesFromFilterReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromFilter"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromFilter") == null) {
            _myOperations.put("getIssuesFromFilter", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromFilter")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromFilterWithLimit", _params, new javax.xml.namespace.QName("", "getIssuesFromFilterWithLimitReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromFilterWithLimit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromFilterWithLimit") == null) {
            _myOperations.put("getIssuesFromFilterWithLimit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromFilterWithLimit")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getIssuesFromTextSearchWithLimit", _params, new javax.xml.namespace.QName("", "getIssuesFromTextSearchWithLimitReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteIssue"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getIssuesFromTextSearchWithLimit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIssuesFromTextSearchWithLimit") == null) {
            _myOperations.put("getIssuesFromTextSearchWithLimit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIssuesFromTextSearchWithLimit")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setNewProjectAvatar", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "setNewProjectAvatar"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setNewProjectAvatar") == null) {
            _myOperations.put("setNewProjectAvatar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setNewProjectAvatar")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSecurityLevels", _params, new javax.xml.namespace.QName("", "getSecurityLevelsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteSecurityLevel"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getSecurityLevels"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSecurityLevels") == null) {
            _myOperations.put("getSecurityLevels", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSecurityLevels")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getComment", _params, new javax.xml.namespace.QName("", "getCommentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteComment"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getComment"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getComment") == null) {
            _myOperations.put("getComment", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getComment")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"), com.atlassian.jira.rpc.soap.beans.RemoteUser.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createGroup", _params, new javax.xml.namespace.QName("", "createGroupReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createGroup") == null) {
            _myOperations.put("createGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createUser", _params, new javax.xml.namespace.QName("", "createUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteUser"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "createUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createUser") == null) {
            _myOperations.put("createUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createUser")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getComponents", _params, new javax.xml.namespace.QName("", "getComponentsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "ArrayOf_tns1_RemoteComponent"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getComponents"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getComponents") == null) {
            _myOperations.put("getComponents", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getComponents")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getConfiguration", _params, new javax.xml.namespace.QName("", "getConfigurationReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteConfiguration"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getConfiguration"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getConfiguration") == null) {
            _myOperations.put("getConfiguration", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getConfiguration")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getServerInfo", _params, new javax.xml.namespace.QName("", "getServerInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteServerInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getServerInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getServerInfo") == null) {
            _myOperations.put("getServerInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getServerInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getGroup", _params, new javax.xml.namespace.QName("", "getGroupReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.jira.atlassian.com", "RemoteGroup"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "getGroup"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getGroup") == null) {
            _myOperations.put("getGroup", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getGroup")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteValidationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteValidationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteValidationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemotePermissionException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemotePermissionException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemotePermissionException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("login", _params, new javax.xml.namespace.QName("", "loginReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "login"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("login") == null) {
            _myOperations.put("login", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("login")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteAuthenticationException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteAuthenticationException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteAuthenticationException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("RemoteException");
        _fault.setQName(new javax.xml.namespace.QName("https://jira.atlassian.com/rpc/soap/jirasoapservice-v2", "fault"));
        _fault.setClassName("com.atlassian.jira.rpc.exception.RemoteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://exception.rpc.jira.atlassian.com", "RemoteException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("logout", _params, new javax.xml.namespace.QName("", "logoutReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://soap.rpc.jira.atlassian.com", "logout"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("logout") == null) {
            _myOperations.put("logout", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("logout")).add(_oper);
    }

    public JirasoapserviceV2SoapBindingSkeleton() {
        this.impl = new com.atlassian.jira.rpc.soap.jirasoapservice_v2.JirasoapserviceV2SoapBindingImpl();
    }

    public JirasoapserviceV2SoapBindingSkeleton(com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService impl) {
        this.impl = impl;
    }
    public com.atlassian.jira.rpc.soap.beans.RemoteProject createProject(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme in6, com.atlassian.jira.rpc.soap.beans.RemoteScheme in7, com.atlassian.jira.rpc.soap.beans.RemoteScheme in8) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.createProject(in0, in1, in2, in3, in4, in5, in6, in7, in8);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject updateProject(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProject in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.updateProject(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject getProjectByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.getProjectByKey(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteSecurityLevel getSecurityLevel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteSecurityLevel ret = impl.getSecurityLevel(in0, in1);
        return ret;
    }

    public void addUserToGroup(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteGroup in1, com.atlassian.jira.rpc.soap.beans.RemoteUser in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.addUserToGroup(in0, in1, in2);
    }

    public void removeUserFromGroup(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteGroup in1, com.atlassian.jira.rpc.soap.beans.RemoteUser in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.removeUserFromGroup(in0, in1, in2);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteUser updateUser(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteUser in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteUser ret = impl.updateUser(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue updateIssue(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteFieldValue[] in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.updateIssue(in0, in1, in2);
        return ret;
    }

    public void deleteIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteIssue(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteNamedObject[] getAvailableActions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteNamedObject[] ret = impl.getAvailableActions(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue getIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.getIssue(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue createIssue(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteIssue in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.createIssue(in0, in1);
        return ret;
    }

    public void addComment(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteComment in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.addComment(in0, in1, in2);
    }

    public void removeAllRoleActorsByProject(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProject in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.removeAllRoleActorsByProject(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePriority[] getPriorities(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePriority[] ret = impl.getPriorities(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteResolution[] getResolutions(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteResolution[] ret = impl.getResolutions(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] getIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] ret = impl.getIssueTypes(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] getSubTaskIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] ret = impl.getSubTaskIssueTypes(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteStatus[] getStatuses(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteStatus[] ret = impl.getStatuses(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteField[] getCustomFields(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteField[] ret = impl.getCustomFields(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteComment editComment(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteComment in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteComment ret = impl.editComment(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProjectRole getProjectRole(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProjectRole ret = impl.getProjectRole(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProjectRoleActors getProjectRoleActors(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1, com.atlassian.jira.rpc.soap.beans.RemoteProject in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProjectRoleActors ret = impl.getProjectRoleActors(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteRoleActors getDefaultRoleActors(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteRoleActors ret = impl.getDefaultRoleActors(in0, in1);
        return ret;
    }

    public void removeAllRoleActorsByNameAndType(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.removeAllRoleActorsByNameAndType(in0, in1, in2);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProjectRole[] getProjectRoles(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProjectRole[] ret = impl.getProjectRoles(in0);
        return ret;
    }

    public void deleteProjectRole(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1, boolean in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteProjectRole(in0, in1, in2);
    }

    public void updateProjectRole(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.updateProjectRole(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProjectRole createProjectRole(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProjectRole ret = impl.createProjectRole(in0, in1);
        return ret;
    }

    public boolean isProjectRoleNameUnique(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.isProjectRoleNameUnique(in0, in1);
        return ret;
    }

    public void addActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in2, com.atlassian.jira.rpc.soap.beans.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.addActorsToProjectRole(in0, in1, in2, in3, in4);
    }

    public void removeActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in2, com.atlassian.jira.rpc.soap.beans.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.removeActorsFromProjectRole(in0, in1, in2, in3, in4);
    }

    public void addDefaultActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.addDefaultActorsToProjectRole(in0, in1, in2, in3);
    }

    public void removeDefaultActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.removeDefaultActorsFromProjectRole(in0, in1, in2, in3);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteScheme[] getAssociatedNotificationSchemes(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteScheme[] ret = impl.getAssociatedNotificationSchemes(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteScheme[] getAssociatedPermissionSchemes(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProjectRole in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteScheme[] ret = impl.getAssociatedPermissionSchemes(in0, in1);
        return ret;
    }

    public void deleteProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteProject(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject getProjectById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.getProjectById(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteVersion[] getVersions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteVersion[] ret = impl.getVersions(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteComment[] getComments(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteComment[] ret = impl.getComments(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteWorklog[] getWorklogs(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteWorklog[] ret = impl.getWorklogs(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteFilter[] getFavouriteFilters(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteFilter[] ret = impl.getFavouriteFilters(in0);
        return ret;
    }

    public void releaseVersion(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteVersion in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.releaseVersion(in0, in1, in2);
    }

    public void archiveVersion(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.archiveVersion(in0, in1, in2, in3);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteField[] getFieldsForCreate(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteField[] ret = impl.getFieldsForCreate(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteField[] getFieldsForEdit(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteField[] ret = impl.getFieldsForEdit(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] getIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] ret = impl.getIssueTypesForProject(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] getSubTaskIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssueType[] ret = impl.getSubTaskIssueTypesForProject(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteGroup updateGroup(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteGroup in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteGroup ret = impl.updateGroup(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteUser ret = impl.getUser(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue createIssueWithSecurityLevel(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteIssue in1, long in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.createIssueWithSecurityLevel(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteWorklog addWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteWorklog ret = impl.addWorklogAndAutoAdjustRemainingEstimate(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteWorklog addWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteWorklog ret = impl.addWorklogAndRetainRemainingEstimate(in0, in1, in2);
        return ret;
    }

    public void deleteWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteWorklogAndAutoAdjustRemainingEstimate(in0, in1);
    }

    public void deleteWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteWorklogAndRetainRemainingEstimate(in0, in1);
    }

    public void deleteWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteWorklogWithNewRemainingEstimate(in0, in1, in2);
    }

    public void updateWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.updateWorklogAndAutoAdjustRemainingEstimate(in0, in1);
    }

    public void updateWorklogAndRetainRemainingEstimate(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.updateWorklogAndRetainRemainingEstimate(in0, in1);
    }

    public void updateWorklogWithNewRemainingEstimate(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.updateWorklogWithNewRemainingEstimate(in0, in1, in2);
    }

    public boolean hasPermissionToCreateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.hasPermissionToCreateWorklog(in0, in1);
        return ret;
    }

    public boolean hasPermissionToDeleteWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.hasPermissionToDeleteWorklog(in0, in1);
        return ret;
    }

    public boolean hasPermissionToUpdateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.hasPermissionToUpdateWorklog(in0, in1);
        return ret;
    }

    public java.util.Calendar getResolutionDateByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        java.util.Calendar ret = impl.getResolutionDateByKey(in0, in1);
        return ret;
    }

    public java.util.Calendar getResolutionDateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        java.util.Calendar ret = impl.getResolutionDateById(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePermission[] getAllPermissions(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePermission[] ret = impl.getAllPermissions(in0);
        return ret;
    }

    public boolean hasPermissionToEditComment(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteComment in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.hasPermissionToEditComment(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteField[] getFieldsForAction(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteField[] ret = impl.getFieldsForAction(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue progressWorkflowAction(java.lang.String in0, java.lang.String in1, java.lang.String in2, com.atlassian.jira.rpc.soap.beans.RemoteFieldValue[] in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.progressWorkflowAction(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue getIssueById(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.getIssueById(in0, in1);
        return ret;
    }

    public boolean addAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, byte[][] in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.addAttachmentsToIssue(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteAttachment[] getAttachmentsFromIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteAttachment[] ret = impl.getAttachmentsFromIssue(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteWorklog addWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteWorklog in2, java.lang.String in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteWorklog ret = impl.addWorklogWithNewRemainingEstimate(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject getProjectWithSchemesById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.getProjectWithSchemesById(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteAvatar[] getProjectAvatars(java.lang.String in0, java.lang.String in1, boolean in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteAvatar[] ret = impl.getProjectAvatars(in0, in1, in2);
        return ret;
    }

    public void setProjectAvatar(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.setProjectAvatar(in0, in1, in2);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteAvatar getProjectAvatar(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteAvatar ret = impl.getProjectAvatar(in0, in1);
        return ret;
    }

    public void deleteProjectAvatar(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteProjectAvatar(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme[] getPermissionSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme[] ret = impl.getPermissionSchemes(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme createPermissionScheme(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme ret = impl.createPermissionScheme(in0, in1, in2);
        return ret;
    }

    public void deletePermissionScheme(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deletePermissionScheme(in0, in1);
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme addPermissionTo(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme in1, com.atlassian.jira.rpc.soap.beans.RemotePermission in2, com.atlassian.jira.rpc.soap.beans.RemoteEntity in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme ret = impl.addPermissionTo(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme deletePermissionFrom(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme in1, com.atlassian.jira.rpc.soap.beans.RemotePermission in2, com.atlassian.jira.rpc.soap.beans.RemoteEntity in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme ret = impl.deletePermissionFrom(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteScheme[] getNotificationSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteScheme[] ret = impl.getNotificationSchemes(in0);
        return ret;
    }

    public long getIssueCountForFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        long ret = impl.getIssueCountForFilter(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromTextSearch(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromTextSearch(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromTextSearchWithProject(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromTextSearchWithProject(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromJqlSearch(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromJqlSearch(in0, in1, in2);
        return ret;
    }

    public void deleteUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteUser(in0, in1);
    }

    public void setUserPassword(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteUser in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.setUserPassword(in0, in1, in2);
    }

    public void deleteGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.deleteGroup(in0, in1, in2);
    }

    public void refreshCustomFields(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.refreshCustomFields(in0);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject[] getProjectsNoSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject[] ret = impl.getProjectsNoSchemes(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteVersion addVersion(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteVersion in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteVersion ret = impl.addVersion(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteFilter[] getSavedFilters(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteFilter[] ret = impl.getSavedFilters(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue createIssueWithParent(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteIssue in1, java.lang.String in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.createIssueWithParent(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue createIssueWithParentWithSecurityLevel(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteIssue in1, java.lang.String in2, long in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue ret = impl.createIssueWithParentWithSecurityLevel(in0, in1, in2, in3);
        return ret;
    }

    public boolean addBase64EncodedAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        boolean ret = impl.addBase64EncodedAttachmentsToIssue(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteProject createProjectFromObject(java.lang.String in0, com.atlassian.jira.rpc.soap.beans.RemoteProject in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteProject ret = impl.createProjectFromObject(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteScheme[] getSecuritySchemes(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteScheme[] ret = impl.getSecuritySchemes(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromFilter(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromFilterWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromFilterWithLimit(in0, in1, in2, in3);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteIssue[] getIssuesFromTextSearchWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteIssue[] ret = impl.getIssuesFromTextSearchWithLimit(in0, in1, in2, in3);
        return ret;
    }

    public void setNewProjectAvatar(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        impl.setNewProjectAvatar(in0, in1, in2, in3);
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteSecurityLevel[] getSecurityLevels(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteSecurityLevel[] ret = impl.getSecurityLevels(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteComment ret = impl.getComment(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteGroup createGroup(java.lang.String in0, java.lang.String in1, com.atlassian.jira.rpc.soap.beans.RemoteUser in2) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteGroup ret = impl.createGroup(in0, in1, in2);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteUser createUser(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteUser ret = impl.createUser(in0, in1, in2, in3, in4);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteComponent[] getComponents(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteComponent[] ret = impl.getComponents(in0, in1);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteConfiguration getConfiguration(java.lang.String in0) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteConfiguration ret = impl.getConfiguration(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteServerInfo ret = impl.getServerInfo(in0);
        return ret;
    }

    public com.atlassian.jira.rpc.soap.beans.RemoteGroup getGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteValidationException, com.atlassian.jira.rpc.exception.RemotePermissionException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        com.atlassian.jira.rpc.soap.beans.RemoteGroup ret = impl.getGroup(in0, in1);
        return ret;
    }

    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.atlassian.jira.rpc.exception.RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException
    {
        java.lang.String ret = impl.login(in0, in1);
        return ret;
    }

    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException
    {
        boolean ret = impl.logout(in0);
        return ret;
    }

}
