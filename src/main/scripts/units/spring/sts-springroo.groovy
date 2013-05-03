// The following feature groups are needed for working with Spring Roo using STS (Springsource Tool Suite)
include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed("springsource") {
		installableUnit {
			id "org.springframework.ide.eclipse.roo.feature.feature.group"
		}
	}
}