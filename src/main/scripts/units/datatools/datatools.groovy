include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		installableUnit {
			id "org.eclipse.datatools.sdk.feature.feature.group"
		}
		installableUnit {
			id "org.eclipse.datatools.enablement.sdk.feature.feature.group"
		}
	}
}
