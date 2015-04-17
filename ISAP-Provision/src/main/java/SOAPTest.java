import java.net.MalformedURLException;
import java.util.*;
import java.io.*;

import com.sun.org.apache.xerces.internal.util.Status;

public class SOAPTest {
	public static final String JIRA_URI = "URL";
	public static final String RPC_PATH = "/rpc/xmlrpc";
	public static final String USER_NAME = "logini";
	public static final String PASSWORD = "PWD";
	public static final String searchTerms = "";
	private static final int maxNumResults = 1000;
	private static final Status Exécution = null;

	/**
	* @param args
	*/

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	try {
	org.codehaus.swizzle.jira.Jira jira = new Jira(JIRA_URI);
	jira.login(USER_NAME, PASSWORD);

	Vector v = new Vector();

	v.add("PUBPROJECT"); // le ou les projets sur lesquels on va effectuer la recherche

	List<Issue> ticket=jira.getIssuesFromTextSearchWithProject(v, searchTerms, maxNumResults);

	if ((ticket.get(0).getStatus().toString()).equals("En Attente d'éxécution"))
	{

	System.out.println(ticket.get(0).getKey());
	System.out.println(ticket.get(0).getType());
	System.out.println(ticket.get(0).getSummary());
	System.out.println(ticket.get(0).getComponents());
	System.out.println(ticket.get(0).getPriority());
	System.out.println(ticket.get(0).getStatus());
	System.out.println(ticket.get(0).getCustomFieldValues());

	}

	} catch (MalformedURLException e) {

	e.printStackTrace();

	} catch (Exception e) {
	e.printStackTrace();

	}

	}
}
