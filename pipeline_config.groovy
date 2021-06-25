/*
  define libraries to load.
  available libraries are based upon the
  library sources configured.
*/
libraries{

    @override docker_build {
        scriptPath = "scripts/pipeline"
        agent = "ubuntu-20.04-2cores-4Gig"

        images = ["node:12", "node:14", "node:16"]
        tests = ["unit_tests.sh catapult-sdk", "unit_tests.sh rest", "unit_tests.sh spammer"]
    }
}
