include "../../include/default.groovy"
director {
	// The following feature group provides word wrapping on text files
	unitsFromRepository("http://ahtik.com/eclipse-update") {
		installableUnit {
			id "com.ahtik.wordwrap.feature.group"
		}
	}
}