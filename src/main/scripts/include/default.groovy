configFrom "../../config/eclipse.properties"
eclipsec "$eclipse.home/$eclipse.command"
consolelog()
//debug()
nosplash()
director {
	destination "$eclipse.home"
}