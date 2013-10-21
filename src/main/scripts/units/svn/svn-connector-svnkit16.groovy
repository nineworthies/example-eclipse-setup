// The following feature groups are needed to work with SVN repositories
include "../../include/default.groovy"
director {
	unitsFromRepository("http://community.polarion.com/projects/subversive/download/eclipse/3.0/kepler-site") {
		installableUnit {
			id "org.polarion.eclipse.team.svn.connector.svnkit16.feature.group"
		}
	}
}