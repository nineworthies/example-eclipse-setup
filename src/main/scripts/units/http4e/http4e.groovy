include "../../include/default.groovy"
director {
	unitsFromRepository("http://nextinterfaces.com/http4e/install") {
		installableUnit {
			id "org.roussev.http4e.ui.feature.group"
		}
	}
}