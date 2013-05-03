include "../../include/default.groovy"
director {
	// The following feature group provides sorting on text files
	unitsFromRepository("http://www.stateofflow.com/UpdateSite") {
		installableUnit {
			id "com.teaminabox.eclipse.sortit.feature.feature.group"
		}
	}
}