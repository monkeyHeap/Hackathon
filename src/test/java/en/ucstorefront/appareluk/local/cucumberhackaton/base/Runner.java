package en.ucstorefront.appareluk.local.cucumberhackaton.base;


import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "java/en/ucstorefront/appareluk/local/cucumberhackaton/page/login",
        tags = "@all"
)
public class Runner {
}
