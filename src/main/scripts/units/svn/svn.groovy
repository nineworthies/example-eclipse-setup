// The following feature groups are needed to work with SVN repositories
include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		installableUnit {
			id "org.eclipse.team.svn.feature.group"
		}
		installableUnit {
			id "org.eclipse.team.svn.resource.ignore.rules.jdt.feature.group"
		}
		installableUnit {
			id "org.eclipse.team.svn.revision.graph.feature.group"
		}
	}
}