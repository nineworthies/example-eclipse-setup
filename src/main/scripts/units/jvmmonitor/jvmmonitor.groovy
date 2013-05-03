include "../../include/default.groovy"
director {
	unitsFromRepository ("http://www.jvmmonitor.org/updates/3.8") {
		installableUnit {
			id "org.jvmmonitor.feature.group" 
		}
	}
}