/*
  define libraries to load.
  available libraries are based upon the
  library sources configured.
*/
libraries{
    generic {
      buildScript = "scripts/pipeline/build.sh"
      funtionalTestScript = "scripts/pipeline/functional_test.sh"
    }
    symbol_bootstrap {
      install=true
    }
    e2e_automation
}
