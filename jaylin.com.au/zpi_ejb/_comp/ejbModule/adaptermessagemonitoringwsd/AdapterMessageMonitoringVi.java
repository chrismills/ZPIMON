package adaptermessagemonitoringwsd;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "AdapterMessageMonitoringVi", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface AdapterMessageMonitoringVi {

  /**
   * Java representation of web method [cancelMessages].
   */
  @javax.jws.WebMethod(operationName = "cancelMessages")
  @javax.xml.ws.RequestWrapper(localName = "cancelMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.CancelMessages")
  @javax.xml.ws.ResponseWrapper(localName = "cancelMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.CancelMessagesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.AdminActionResultMap cancelMessages(@javax.jws.WebParam(name = "messageKeys", targetNamespace = "urn:AdapterMessageMonitoringVi") lang.java2.ArrayOfString messageKeys) throws adaptermessagemonitoringwsd.CancelMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,adaptermessagemonitoringwsd.CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  /**
   * Java representation of web method [getConnections].
   */
  @javax.jws.WebMethod(operationName = "getConnections")
  @javax.xml.ws.RequestWrapper(localName = "getConnections", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetConnections")
  @javax.xml.ws.ResponseWrapper(localName = "getConnectionsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetConnectionsResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public lang.java2.ArrayOfString getConnections() throws adaptermessagemonitoringwsd.GetConnectionsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getInterfaces].
   */
  @javax.jws.WebMethod(operationName = "getInterfaces")
  @javax.xml.ws.RequestWrapper(localName = "getInterfaces", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetInterfaces")
  @javax.xml.ws.ResponseWrapper(localName = "getInterfacesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetInterfacesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public data.api.mdt.aii.sap.com.ArrayOfMessageInterface getInterfaces() throws adaptermessagemonitoringwsd.GetInterfacesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getUserDefinedSearchFilters].
   */
  @javax.jws.WebMethod(operationName = "getUserDefinedSearchFilters")
  @javax.xml.ws.RequestWrapper(localName = "getUserDefinedSearchFilters", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchFilters")
  @javax.xml.ws.ResponseWrapper(localName = "getUserDefinedSearchFiltersResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchFiltersResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public data.api.mdt.aii.sap.com.ArrayOfMessageInterface getUserDefinedSearchFilters() throws adaptermessagemonitoringwsd.GetUserDefinedSearchFiltersComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getUserDefinedSearchExtractors].
   */
  @javax.jws.WebMethod(operationName = "getUserDefinedSearchExtractors")
  @javax.xml.ws.RequestWrapper(localName = "getUserDefinedSearchExtractors", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchExtractors")
  @javax.xml.ws.ResponseWrapper(localName = "getUserDefinedSearchExtractorsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchExtractorsResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.ArrayOfAttributeMetadata getUserDefinedSearchExtractors(@javax.jws.WebParam(name = "name", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String name, @javax.jws.WebParam(name = "namespace", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String namespace) throws adaptermessagemonitoringwsd.GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getMessageBytesJavaLangStringBoolean].
   */
  @javax.jws.WebMethod(operationName = "getMessageBytesJavaLangStringBoolean")
  @javax.xml.ws.RequestWrapper(localName = "getMessageBytesJavaLangStringBoolean", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageBytesJavaLangStringBoolean")
  @javax.xml.ws.ResponseWrapper(localName = "getMessageBytesJavaLangStringBooleanResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageBytesJavaLangStringBooleanResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public byte[] getMessageBytesJavaLangStringBoolean(@javax.jws.WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String messageKey, @javax.jws.WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi") boolean archive) throws adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  /**
   * Java representation of web method [getMessageBytesJavaLangStringIntBoolean].
   */
  @javax.jws.WebMethod(operationName = "getMessageBytesJavaLangStringIntBoolean")
  @javax.xml.ws.RequestWrapper(localName = "getMessageBytesJavaLangStringIntBoolean", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageBytesJavaLangStringIntBoolean")
  @javax.xml.ws.ResponseWrapper(localName = "getMessageBytesJavaLangStringIntBooleanResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageBytesJavaLangStringIntBooleanResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public byte[] getMessageBytesJavaLangStringIntBoolean(@javax.jws.WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String messageKey, @javax.jws.WebParam(name = "version", targetNamespace = "urn:AdapterMessageMonitoringVi") int version, @javax.jws.WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi") boolean archive) throws adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,adaptermessagemonitoringwsd.GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  /**
   * Java representation of web method [getMessageList].
   */
  @javax.jws.WebMethod(operationName = "getMessageList")
  @javax.xml.ws.RequestWrapper(localName = "getMessageList", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageList")
  @javax.xml.ws.ResponseWrapper(localName = "getMessageListResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessageListResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue getMessageList(@javax.jws.WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.AdapterFilter filter, @javax.jws.WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.Integer maxMessages) throws adaptermessagemonitoringwsd.GetMessageListComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getUserDefinedSearchMessages].
   */
  @javax.jws.WebMethod(operationName = "getUserDefinedSearchMessages")
  @javax.xml.ws.RequestWrapper(localName = "getUserDefinedSearchMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchMessages")
  @javax.xml.ws.ResponseWrapper(localName = "getUserDefinedSearchMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetUserDefinedSearchMessagesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue getUserDefinedSearchMessages(@javax.jws.WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.AdapterFilter filter, @javax.jws.WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.Integer maxMessages, @javax.jws.WebParam(name = "attributes", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.ArrayOfBusinessAttribute attributes, @javax.jws.WebParam(name = "operator", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String operator) throws adaptermessagemonitoringwsd.GetUserDefinedSearchMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getMessagesByKeys].
   */
  @javax.jws.WebMethod(operationName = "getMessagesByKeys")
  @javax.xml.ws.RequestWrapper(localName = "getMessagesByKeys", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessagesByKeys")
  @javax.xml.ws.ResponseWrapper(localName = "getMessagesByKeysResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetMessagesByKeysResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.MessageSearchReturnValue getMessagesByKeys(@javax.jws.WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi") lang.java2.ArrayOfString filter, @javax.jws.WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.Integer maxMessages) throws adaptermessagemonitoringwsd.GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getLogEntries].
   */
  @javax.jws.WebMethod(operationName = "getLogEntries")
  @javax.xml.ws.RequestWrapper(localName = "getLogEntries", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetLogEntries")
  @javax.xml.ws.ResponseWrapper(localName = "getLogEntriesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetLogEntriesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public data.api.mdt.aii.sap.com.ArrayOfAuditLogEntryData getLogEntries(@javax.jws.WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String messageKey, @javax.jws.WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi") boolean archive, @javax.jws.WebParam(name = "maxResults", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.Integer maxResults, @javax.jws.WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.Locale locale, @javax.jws.WebParam(name = "olderThan", targetNamespace = "urn:AdapterMessageMonitoringVi") javax.xml.datatype.XMLGregorianCalendar olderThan) throws adaptermessagemonitoringwsd.GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,adaptermessagemonitoringwsd.GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  /**
   * Java representation of web method [getParties].
   */
  @javax.jws.WebMethod(operationName = "getParties")
  @javax.xml.ws.RequestWrapper(localName = "getParties", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetParties")
  @javax.xml.ws.ResponseWrapper(localName = "getPartiesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetPartiesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public data.api.mdt.aii.sap.com.ArrayOfMessageParty getParties() throws adaptermessagemonitoringwsd.GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getServices].
   */
  @javax.jws.WebMethod(operationName = "getServices")
  @javax.xml.ws.RequestWrapper(localName = "getServices", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetServices")
  @javax.xml.ws.ResponseWrapper(localName = "getServicesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetServicesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public lang.java2.ArrayOfString getServices() throws adaptermessagemonitoringwsd.GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [resendMessages].
   */
  @javax.jws.WebMethod(operationName = "resendMessages")
  @javax.xml.ws.RequestWrapper(localName = "resendMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.ResendMessages")
  @javax.xml.ws.ResponseWrapper(localName = "resendMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.ResendMessagesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.AdminActionResultMap resendMessages(@javax.jws.WebParam(name = "messageKeys", targetNamespace = "urn:AdapterMessageMonitoringVi") lang.java2.ArrayOfString messageKeys) throws adaptermessagemonitoringwsd.ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc,adaptermessagemonitoringwsd.ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

  /**
   * Java representation of web method [getStatusDetails].
   */
  @javax.jws.WebMethod(operationName = "getStatusDetails")
  @javax.xml.ws.RequestWrapper(localName = "getStatusDetails", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetStatusDetails")
  @javax.xml.ws.ResponseWrapper(localName = "getStatusDetailsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetStatusDetailsResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.ArrayOfStatusDetail getStatusDetails(@javax.jws.WebParam(name = "errorCodes", targetNamespace = "urn:AdapterMessageMonitoringVi") lang.java2.ArrayOfString errorCodes, @javax.jws.WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.Locale locale) throws adaptermessagemonitoringwsd.GetStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getAllAvailableStatusDetails].
   */
  @javax.jws.WebMethod(operationName = "getAllAvailableStatusDetails")
  @javax.xml.ws.RequestWrapper(localName = "getAllAvailableStatusDetails", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetAllAvailableStatusDetails")
  @javax.xml.ws.ResponseWrapper(localName = "getAllAvailableStatusDetailsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetAllAvailableStatusDetailsResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.ArrayOfStatusDetail getAllAvailableStatusDetails(@javax.jws.WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi") ws.adapterframework.server.mdt.aii.sap.com.Locale locale) throws adaptermessagemonitoringwsd.GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getErrorCodes].
   */
  @javax.jws.WebMethod(operationName = "getErrorCodes")
  @javax.xml.ws.RequestWrapper(localName = "getErrorCodes", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetErrorCodes")
  @javax.xml.ws.ResponseWrapper(localName = "getErrorCodesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetErrorCodesResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public lang.java2.ArrayOfString getErrorCodes(@javax.jws.WebParam(name = "errorLabelID", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.Integer errorLabelID) throws adaptermessagemonitoringwsd.GetErrorCodesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  /**
   * Java representation of web method [getIntegrationFlows].
   */
  @javax.jws.WebMethod(operationName = "getIntegrationFlows")
  @javax.xml.ws.RequestWrapper(localName = "getIntegrationFlows", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetIntegrationFlows")
  @javax.xml.ws.ResponseWrapper(localName = "getIntegrationFlowsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "adaptermessagemonitoringvi.GetIntegrationFlowsResponse")
  @javax.jws.WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
  public ws.adapterframework.server.mdt.aii.sap.com.ArrayOfIntegrationFlow getIntegrationFlows(@javax.jws.WebParam(name = "language", targetNamespace = "urn:AdapterMessageMonitoringVi") java.lang.String language) throws adaptermessagemonitoringwsd.GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

}