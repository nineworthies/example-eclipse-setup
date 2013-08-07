include "../../include/default.groovy"
director {
	unitsFromRepository ("http://update.zeroturnaround.com/update-site-archive/update-site-5.3.0.RELEASE") {
		installableUnit {
			id "org.zeroturnaround.eclipse.feature.feature.group" 
		}
	}
}