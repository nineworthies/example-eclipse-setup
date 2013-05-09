include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	unitsFromRepositoryNamed("eclipse") {
		// The following feature group is needed for jee developer tools
		installableUnit {
			id "org.eclipse.jst.enterprise_ui.feature.feature.group"
		}
		// The following feature group is needed for war tooling
		installableUnit {
			id "org.eclipse.libra.warproducts.feature.feature.group"
		}
		// The following feature group is needed for jsp tools
		installableUnit {
			id "org.eclipse.jst.web_ui.feature.feature.group"
		}
		// The following feature groups are needed for creating and running wtp servers etc
		// n.b. regarding servers, 'org.eclipse.jst.enterprise_ui.feature.feature.group' (included above)
		// is also needed to avoid "Could not initialize class org.eclipse.jst.j2ee.project.facet.IJ2EEFacetConstants"
		// when adding the "static web project" facet to a project
		installableUnit {
			id "org.eclipse.jst.server_adapters.feature.feature.group"
		}
		installableUnit {
			id "org.eclipse.jst.server_adapters.ext.feature.feature.group"
		}
		installableUnit {
			id "org.eclipse.jst.web_ui.feature.feature.group"
		}
		installableUnit {
			id "org.eclipse.jst.server_ui.feature.feature.group"
		}
		installableUnit {
			id "org.eclipse.wst.server_adapters.feature.feature.group"
		}
	}
}