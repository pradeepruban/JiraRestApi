package com.atlassian.jira.rpc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atlassian.jira.rpc.bean.Project;
import com.atlassian.jira.rpc.soap.beans.RemoteIssue;
import com.atlassian.jira.rpc.soap.beans.RemotePermissionScheme;
import com.atlassian.jira.rpc.soap.beans.RemoteProject;
import com.atlassian.jira.rpc.soap.beans.RemoteScheme;
import com.atlassian.jira.rpc.soap.jirasoapservice_v2.JiraSoapService;

@Controller
public class VdcController {
	

		private static final String LOGIN_NAME = "admin";
		private static final String LOGIN_PASSWORD ="syntel123$";
        private static String PROJECT_KEY =null ;
        private static String PROJECT_NAME=null;;
        private static final String ISSUE_TYPE_ID = "2";
        private static final String ISSUE_KEY="ISAP";
        private static final String SUMMARY_NAME = "CLOUD Issue reported for provision : " + new Date();
        private static final String PRIORITY_ID = "4";
        private static final String NEW_COMMENT_BODY = "MSO Related Issue";

		@RequestMapping(value="/addProject", method=RequestMethod.POST)
     	public ModelAndView register(@ModelAttribute("project") Project project) throws MalformedURLException, RemoteException{
			
			 String baseUrl = "http://192.168.175.237:8080/rpc/soap/jirasoapservice-v2";
		        System.out.println("JIRA SOAP client sample");
		        System.out.println("=========="+project.getProj_name());
		        System.out.println("=========="+project.getProj_desc());
		        SOAPSession soapSession = new SOAPSession(new URL(baseUrl));
		        soapSession.connect(LOGIN_NAME, LOGIN_PASSWORD);
		        JiraSoapService jiraSoapService = soapSession.getJiraSoapService();
		        String authToken = soapSession.getAuthenticationToken();
		       RemoteProject projects = addRemoteProject(authToken,jiraSoapService,project);
			System.out.println("Hello");
			ModelAndView model=new ModelAndView("addProjects");
   	     	return model;
		}
        
		@RequestMapping(value="/addIssue", method=RequestMethod.POST)
     	public ModelAndView issue(@ModelAttribute("project") Project project) throws MalformedURLException, RemoteException{ 
			 String baseUrl = "http://192.168.175.237:8080/rpc/soap/jirasoapservice-v2";
		        System.out.println("JIRA SOAP client sample");
		        SOAPSession soapSession = new SOAPSession(new URL(baseUrl));
		        soapSession.connect(LOGIN_NAME, LOGIN_PASSWORD);
		        JiraSoapService jiraSoapService = soapSession.getJiraSoapService();
		        String authToken = soapSession.getAuthenticationToken();
		        RemoteIssue issue = testCreateIssue(jiraSoapService, authToken , project);
		     	System.out.println("=================Hello");
			ModelAndView model=new ModelAndView("addIssue");
   	     	return model;
		}
      
		   private static RemoteIssue testCreateIssue(JiraSoapService jiraSoapService, String token,Project project)
		            throws java.rmi.RemoteException
		    {
		           System.out.println("CreateIssue");
		           PROJECT_KEY=project.getProj_key();
		           System.out.println("================"+PROJECT_KEY);
		           PROJECT_NAME=project.getProj_name();  
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
		    
		private RemoteProject addRemoteProject(String token,
				JiraSoapService jiraSoapService, Project project) {
			// TODO Auto-generated method stub
			String PROJECT_NAME=project.getProj_name();
			String PROJECT_KEY=project.getProj_key();
			String PROJECT_DESC="ISAP-Provision Description";
			String PROJECT_URL="http://192.168.175.62:8082/ISAP_Provision";
			String PROJECT_LEAD="admin"; 
			System.out.println("===="+PROJECT_NAME+"========="+PROJECT_KEY+"=========="+PROJECT_DESC);
			System.out.println("Inside addProject"+project.getProj_name());
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