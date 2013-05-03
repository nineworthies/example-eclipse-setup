// The following feature groups are needed to work with Maven projects in Git repositories
include "../../include/default.groovy"
director {
	unitsFromRepository("https://repository.sonatype.org/content/sites/forge-sites/m2eclipse-subversive/0.13.0/N/0.13.0.201106211115") {
		installableUnit {
			id "org.sonatype.m2e.subversive.feature.feature.group"
		}
	}
}