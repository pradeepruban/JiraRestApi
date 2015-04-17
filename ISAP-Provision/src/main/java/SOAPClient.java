
import com.atlassian.jira.rpc.soap.beans.RemoteComment;
import com.atlassian.jira.rpc.soap.beans.RemoteComponent;
import com.atlassian.jira.rpc.soap.beans.RemoteCustomFieldValue;
import com.atlassian.jira.rpc.soap.beans.RemoteFilter;
import com.atlassian.jira.rpc.soap.beans.RemoteIssue;
import com.atlassian.jira.rpc.soap.beans.RemoteVersion;
import com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService;
import com.atlassian.jira.rpc.soap.beans.RemoteProject;
import com.atlassian.jira.rpc.soap.beans.RemoteIssueType;
import com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme;
import com.atlassian.jira.rpc.soap.beans.RemoteProject;
import com.atlassian.jira.rpc.soap.beans.RemoteProjectRole;
import com.atlassian.jira.rpc.soap.beans.RemoteScheme;
import com.atlassian.jira.rpc.soap.beans.RemoteVersion;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class SOAPClient
{
    static final String LOGIN_NAME = "admin";
    static final String LOGIN_PASSWORD = "syntel123$";
    static final String PROJECT_KEY = "CLOUD";
    static final String PROJECT_NAME = "softwaredevelop";
    static final String ISSUE_TYPE_ID = "2";
    static final String ISSUE_KEY="ISAP";
    static final String SUMMARY_NAME = "CLOUD Issue reported for provision : " + new Date();
    static final String PRIORITY_ID = "4";
    static final String NEW_COMMENT_BODY = "MSO Related Issue";

    public static void main(String[] args) throws Exception
    {
        String baseUrl = "http://192.168.175.237:8080/rpc/soap/jirasoapservice-v2";
        System.out.println("JIRA SOAP client sample");
        SOAPSession soapSession = new SOAPSession(new URL(baseUrl));
        soapSession.connect(LOGIN_NAME, LOGIN_PASSWORD);
        JiraSoapService jiraSoapService = soapSession.getJiraSoapService();
        String authToken = soapSession.getAuthenticationToken();
       RemoteIssue issue = testCreateIssue(jiraSoapService, authToken);
      // RemoteProject projects = addRemoteProject(authToken,jiraSoapService);
       
    }

    
    private static RemoteIssue testCreateIssue(JiraSoapService jiraSoapService, String token)
            throws java.rmi.RemoteException
    {
        System.out.println("CreateIssue");
            RemoteIssue issue = new RemoteIssue();
            issue.setProject(PROJECT_KEY);
            issue.setType(ISSUE_TYPE_ID);
            issue.setSummary(SUMMARY_NAME);
            issue.setPriority(PRIORITY_ID);
            issue.setDuedate(Calendar.getInstance());
            issue.setAssignee("");
            issue.setKey(ISSUE_KEY);
          

            // Run the create issue code
            RemoteIssue returnedIssue = jiraSoapService.createIssue(token, issue);
            final String issueKey = returnedIssue.getKey();

            System.out.println("\tSuccessfully created issue " + issueKey);
            printIssueDetails(returnedIssue);
            return returnedIssue;
    }
   
    	
   
  
    
   
    private static void printIssueDetails(RemoteIssue issue)
    {
        System.out.println("Issue Details : ");
        Method[] declaredMethods = issue.getClass().getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++)
        {
            Method declaredMethod = declaredMethods[i];
            if (declaredMethod.getName().startsWith("get") && declaredMethod.getParameterTypes().length == 0)
            {
                System.out.print("\t Issue." + declaredMethod.getName() + "() -> ");
                try
                {
                    Object obj = declaredMethod.invoke(issue, new Object[] { });
                    if (obj instanceof Object[])
                    {
                        obj = arrayToStr((Object[]) obj);
                    }
                    else
                    {
                    }
                    System.out.println(obj);
                }
                catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                catch (InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static RemoteProject addRemoteProject(String token, JiraSoapService jiraSoapService)

    {
    String PROJECT_KEY="CLOUD"; 
    String PROJECT_NAME="CLOUDMSO";
    String PROJECT_DESC="ISAP-Provision Description";
    String PROJECT_URL="http://192.168.175.59:8080/ISAP_Provision";
    String PROJECT_LEAD="admin";

    RemoteProject remoteProject = null;
    try
    {
    // to obtain object of Default Permission Scheme
    RemotePermissionScheme[] remotePermissionSchemeArray = jiraSoapService.getPermissionSchemes(token);
    RemotePermissionScheme remotePermissionScheme = null;

    for (int i = 0; i < remotePermissionSchemeArray.length; i++)
    {
    if (remotePermissionSchemeArray[i].getName().equalsIgnoreCase("Default Permission Scheme"))
    {
    System.out.println("remotePermissionSchemeArray " + i + " :: " + remotePermissionSchemeArray[i].getName());
    remotePermissionScheme = remotePermissionSchemeArray[i];
    }
    }

    // to obtain object of Default Notification Scheme
    RemoteScheme[] remoteNotificationSchemesArray = jiraSoapService.getNotificationSchemes(token);
    RemoteScheme remoteNotificationSchemes = null;

    for (int i = 0; i < remoteNotificationSchemesArray.length; i++)
    {
    if (remoteNotificationSchemesArray[i].getName().equalsIgnoreCase("Default Notification Scheme"))
    {
    remoteNotificationSchemes = remoteNotificationSchemesArray[i];
    }
    }

    // to obtain object of Issue Security Scheme
    RemoteScheme[] remoteSecuritySchemesArray = jiraSoapService.getSecuritySchemes(token);
    RemoteScheme remoteSecuritySchemes = null;

    remoteProject = jiraSoapService.createProject(token,
    PROJECT_KEY,
    PROJECT_NAME,
    PROJECT_DESC,PROJECT_URL,
    PROJECT_LEAD,
    remotePermissionScheme,
    remoteNotificationSchemes,
    remoteSecuritySchemes);
    }
    catch (Exception e)
    {
    System.out.println("Error in addRemoteProject :: "+ e.getMessage());
    e.printStackTrace();
    }
    return remoteProject;
    }

   
    
    

    private static String arrayToStr(Object[] o)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < o.length; i++)
        {
            sb.append(o[i]).append(" ");
        }
        return sb.toString();
    }

    private static byte[] getBytesFromFile(File file) throws IOException
    {
        InputStream is = new FileInputStream(file);

        long length = file.length();
        if (length < Integer.MAX_VALUE)
        {
            byte[] bytes = new byte[(int) length];
            int offset = 0;
            int numRead;
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)
            {
                offset += numRead;
            }

            if (offset < bytes.length)
            {
                throw new IOException("Could not completely read file " + file.getName());
            }

            is.close();
            return bytes;
        }
        else
        {
            System.out.println("File is too large");
            return null;
        }
    }
}