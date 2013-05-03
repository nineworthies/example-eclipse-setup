include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		installableUnit {
			id "org.eclipse.papyrus.sdk.feature.feature.group"
		}
	}
}