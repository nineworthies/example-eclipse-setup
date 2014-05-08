include "../../include/default.groovy"
include "../../include/repository-springsource.groovy"
director {
	unitsFromRepositoryNamed("springsource") {
		installableUnit {
			id "com.vmware.vfabric.ide.eclipse.tcserver.feature.group"
		}
		installableUnit {
			id "com.vmware.vfabric.ide.eclipse.tcserver.insight.feature.group"
		}
	}
}
