// The following feature groups are needed to work with Maven projects in Git repositories
include "../../include/default.groovy"
director {
	unitsFromRepository ("http://repository.tesla.io:8081/nexus/content/sites/m2e.extras/m2eclipse-egit/0.14.0/N/0.14.0.201207041402") {
		installableUnit {
			id "org.sonatype.m2e.egit.feature.feature.group"
		}
	}
}