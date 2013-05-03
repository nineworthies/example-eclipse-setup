include "../../include/default.groovy"
director {
	unitsFromRepository("http://svn.codespot.com/a/eclipselabs.org/jsdt-jquery/updatesite") {
		// The following feature group is needed to provide Jquery support for the Javascript development tools
		installableUnit {
			id "org.eclipselabs.jsdt.jquery_feature.feature.group"
		}
	}
}