plugins {
    base
    id("cobblemontrainers.root-conventions")
}

group = "com.selfdot.cobblemontrainers"
version = "${project.property("mod_version")}+${project.property("mc_version")}-economy-api"

val isSnapshot = project.property("snapshot")?.equals("true") ?: false
if (isSnapshot) {
    version = "$version-SNAPSHOT"
}