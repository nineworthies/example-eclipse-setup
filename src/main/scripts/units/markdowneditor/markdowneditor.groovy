include "../../include/default.groovy"
director {
	unitsFromRepository("http://www.winterwell.com/software/updatesite/") {
		installableUnit {
			id "markdown.editor.feature.feature.group"
		}
	}
}