// The following feature groups provide a CSS theme editor under 'General -> Appearance'
// in the Preferences dialog
include "../../include/default.groovy"
director {
	unitsFromRepository ("http://download.eclipse.org/e4/updates/0.16-I-builds") {
		installableUnit {
			id "org.eclipse.e4.tools.orion.css.editor.feature.feature.group" 
		}
	}
}
