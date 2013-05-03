include "../../include/default.groovy"
director {
	unitsFromRepository("http://www.jnario.org/updates/snapshot") {
		installableUnit {
			id "org.jnario.sdk.feature.group"
		}
	}
}