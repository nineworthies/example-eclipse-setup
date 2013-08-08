include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed("springsource") {
		installableUnit {
			id "org.springsource.ide.eclipse.commons.quicksearch.feature.feature.group"
		}
	}
}