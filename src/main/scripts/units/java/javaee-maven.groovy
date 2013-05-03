include "../../include/default.groovy"
director {
	unitsFromRepository("http://download.eclipse.org/m2e-wtp/releases/juno") {
		// The following feature group is needed for Maven projects that need java ee developer tools
		installableUnit {
			id "org.eclipse.m2e.wtp.feature.feature.group"
		}
	}
}