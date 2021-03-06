package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;

public class JIRAIssueLink implements Identifiable<Long> {
    private Long id;
    private List<JIRAIssueLinkType> type;
    private JIRAIssue inwardIssue;
    private JIRAIssue outwardIssue;
    private JIRAIssueComment comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<JIRAIssueLinkType> getType() {
        return type;
    }

    public void setType(List<JIRAIssueLinkType> type) {
        this.type = type;
    }

    public JIRAIssue getInwardIssue() {
        return inwardIssue;
    }

    public void setInwardIssue(JIRAIssue inwardIssue) {
        this.inwardIssue = inwardIssue;
    }

    public JIRAIssue getOutwardIssue() {
        return outwardIssue;
    }

    public void setOutwardIssue(JIRAIssue outwardIssue) {
        this.outwardIssue = outwardIssue;
    }

    public JIRAIssueComment getComment() {
        return comment;
    }

    public void setComment(JIRAIssueComment comment) {
        this.comment = comment;
    }
}