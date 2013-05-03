include "../../include/default.groovy"
director {
	unitsFromRepository ("http://mercurialeclipse.eclipselabs.org.codespot.com/hg.wiki/update_site/stable") {
		installableUnit {
			id "mercurialeclipse.feature.group"
		}
	}
}