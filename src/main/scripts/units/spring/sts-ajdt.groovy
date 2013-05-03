include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed("springsource") {
		installableUnit {
			id "org.springframework.ide.eclipse.ajdt.feature.feature.group"
		}
	}
}