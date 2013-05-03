include "../../include/default.groovy"
director {
	unitsFromRepository ("http://chromedevtools.googlecode.com/svn/update/dev") {
		installableUnit {
			id "org.chromium.debug.feature.group"
		}
		installableUnit {
			id "org.chromium.debug.jsdtbridge.feature.group"
		}
		installableUnit {
			id "org.chromium.sdk.wipbackends.feature.group"
		}
	}
}