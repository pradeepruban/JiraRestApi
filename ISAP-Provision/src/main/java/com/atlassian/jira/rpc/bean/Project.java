package com.atlassian.jira.rpc.bean;

public class Project {
	
	private String proj_name;
	private String proj_key;
	private String proj_desc;
	private String proj_url;
	private String proj_lead;
	private String proj_id;
	private String summary;
	private String issue_key;
	
	
	public String getProj_id() {
		return proj_id;
	}
	public void setProj_id(String proj_id) {
		this.proj_id = proj_id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getIssue_key() {
		return issue_key;
	}
	public void setIssue_key(String issue_key) {
		this.issue_key = issue_key;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public String getProj_key() {
		return proj_key;
	}
	public void setProj_key(String proj_key) {
		this.proj_key = proj_key;
	}
	public String getProj_desc() {
		return proj_desc;
	}
	public void setProj_desc(String proj_desc) {
		this.proj_desc = proj_desc;
	}
	public String getProj_url() {
		return proj_url;
	}
	public void setProj_url(String proj_url) {
		this.proj_url = proj_url;
	}
	public String getProj_lead() {
		return proj_lead;
	}
	public void setProj_lead(String proj_lead) {
		this.proj_lead = proj_lead;
	}

}
