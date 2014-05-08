include "../../include/default.groovy"
director {
	unitsFromRepository("http://updatesite.ccw-ide.org/stable") {
		installableUnit {
			id "ccw.feature.feature.group"
		}
	}
}