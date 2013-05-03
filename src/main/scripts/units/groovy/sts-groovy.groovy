// The following feature groups are needed for working with Groovy projects using STS (Springsource Tool Suite)
include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed ("springsource") {
		installableUnit {
			id "org.codehaus.groovy.eclipse.feature.feature.group"
		}
		installableUnit {
			id "org.codehaus.groovy21.feature.feature.group"
		}
	}
}