
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService;
import com.atlassian.jira.rpc.exception.RemoteAuthenticationException;
import com.atlassian.jira.rpc.soap.beans.RemoteCustomFieldValue;
import com.atlassian.jira.rpc.soap.beans.RemoteIssue;
import com.atlassian.jira.rpc.exception.RemotePermissionException;
import com.atlassian.jira.rpc.exception.RemoteValidationException;

public class CustomFieldValues
{
	static final String LOGIN_NAME = "admin";
    static final String LOGIN_PASSWORD = "syntel123$";
    static final String ISSUE_KEY = "MSO";
 
    public static void main(String[] args) {
        System.out.println("Executing J-tricks' JIRA SOAP Client");
        String baseUrl = " http://192.168.175.237:8080/rpc/soap/jirasoapservice-v2";
        try {
            SOAPSession soapSession = new SOAPSession(new URL(baseUrl));
            soapSession.connect(LOGIN_NAME, LOGIN_PASSWORD);
            JiraSoapService jiraSoapService = soapSession.getJiraSoapService();
            String authToken = soapSession.getAuthenticationToken();
            getCFsFromIssue(jiraSoapService, authToken);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    private static void getCFsFromIssue(JiraSoapService jiraSoapService, String authToken) throws RemotePermissionException,
            RemoteValidationException, RemoteAuthenticationException, com.atlassian.jira.rpc.exception.RemoteException, RemoteException {
        RemoteIssue issue = jiraSoapService.getIssue(authToken, ISSUE_KEY);
        RemoteCustomFieldValue[] cfValues = issue.getCustomFieldValues();
        for (RemoteCustomFieldValue remoteCustomFieldValue : cfValues) {
            String[] values = remoteCustomFieldValue.getValues();
            for (String value : values) {
                System.out.println("Value for CF with Id:" + remoteCustomFieldValue.getCustomfieldId() + " -" + value);
            }
        }
        System.out.println("All CF Values printed!");
    }
}