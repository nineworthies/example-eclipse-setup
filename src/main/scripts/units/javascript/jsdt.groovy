include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		// The following feature group is needed for Javascript development tools
		installableUnit {
			id "org.eclipse.wst.jsdt.feature.feature.group"
		}
	}
}