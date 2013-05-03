include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		// The following feature group is needed for the web developer tools, including HTML, CSS, XHTML
		installableUnit {
			id "org.eclipse.wst.web_ui.feature.feature.group"
		}
		// The following feature group is needed for the web page editor
		installableUnit {
			id "org.eclipse.jst.webpageeditor.feature.feature.group"
		}
	}
}