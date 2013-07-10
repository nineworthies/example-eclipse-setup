// The following feature groups are needed for working with Freemarker templates
include "../../include/default.groovy"
include "../../include/repository-jboss.groovy"
director {
	unitsFromRepositoryNamed ("jboss") {
		installableUnit {
			id "org.jboss.ide.eclipse.freemarker.feature.feature.group"
		}
	}
}
