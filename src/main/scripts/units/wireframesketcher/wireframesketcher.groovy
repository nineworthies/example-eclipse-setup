include "../../include/default.groovy"
director {
	unitsFromRepository("http://wireframesketcher.com/updates") {
		installableUnit {
			id "com.wireframesketcher.feature.group"
		}
	}
}