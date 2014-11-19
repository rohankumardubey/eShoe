package com.issuetracker.dao.api;

import com.issuetracker.model.*;
import com.issuetracker.model.Issue.Priority;

import java.util.List;

/**
 *
 * @author mgottval
 */
public interface IssueDao {
    
    List<Issue> getIssues();
    
    Issue getIssueById(Long id);
    
    Issue getIssueByName(String name);
    
    void insert(Issue issue);
    
    void update(Issue issue);
    
    void remove(Issue issue);
    
    List<Issue> getIssuesByProject(Project project);
    
    List<Issue> getIssuesByProjectName(String projectName);
    
    List<Priority> getPriorities();
    
    List<Issue> getIssuesByAffectedVersions(List<ProjectVersion> affectedVersions);
            
    List<Issue> getIssuesBySearch(Project project, List<ProjectVersion> affectedVersions, 
    Component component, List<IssueType> issueTypes, List<Status> statusList, String nameContainsText);
    
    List<String> getIssueWatchers(Issue issue);
    
    List<Comment> getComments(Issue issue);
    
}
