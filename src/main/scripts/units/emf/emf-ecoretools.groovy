include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		installableUnit {
			id "org.eclipse.emf.ecoretools.sdk.feature.group"
		}
	}
}