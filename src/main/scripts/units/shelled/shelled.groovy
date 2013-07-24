include "../../include/default.groovy"
director {
	unitsFromRepository ("http://sourceforge.net/projects/shelled/files/shelled/update/") {
		installableUnit {
			id "net.sourceforge.shelled.feature.group"
		}
	}
}
