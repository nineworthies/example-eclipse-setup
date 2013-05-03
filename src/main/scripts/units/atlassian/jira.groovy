include "../../include/default.groovy"
director {
	unitsFromRepository("http://update.atlassian.com/atlassian-eclipse-plugin/rest/e3.6") {
		installableUnit {
			id "com.atlassian.connector.eclipse.jira.feature.group"
		}
	}
}