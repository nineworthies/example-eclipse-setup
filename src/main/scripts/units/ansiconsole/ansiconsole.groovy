include "../../include/default.groovy"
director {
	unitsFromRepository ("http://www.mihai-nita.net/eclipse") {
		installableUnit {
			id "net.mihai-nita.ansicon.feature.group" 
		}
	}
}
