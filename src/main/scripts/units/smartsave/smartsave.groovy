include "../../include/default.groovy"
director {
	// The following feature group provides auto save after editing files
	unitsFromRepository("https://raw.github.com/mystilleef/eclipse4-smartsave-updatesite/master/com.laboki.eclipse.updatesite.smartsave") {
		installableUnit {
			id "com.laboki.eclipse.feature.smartsave.feature.group"
		}
	}
}
