// The following feature groups are needed for working with GWT projects using the Google Plugin for Eclipse
include "../../include/default.groovy"
include "../../include/repository-google.groovy"
director {
	unitsFromRepositoryNamed ("google") {
		installableUnit {
			id "com.google.gdt.eclipse.suite.e42.feature.feature.group"
		}
		installableUnit {
			id "com.google.gwt.eclipse.sdkbundle.feature.feature.group"
		}
	}
}
