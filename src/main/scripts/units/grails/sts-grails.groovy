// The following feature groups are needed for working with Grails projects using STS (Springsource Tool Suite)
include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed ("springsource") {
		installableUnit {
			id "org.grails.ide.eclipse.feature.group"
		}
	}
}