package en.ucstorefront.appareluk.local.cucumberhackaton.utility;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:ownerConfig.properties")
public interface ServerConfig extends Config{

    @Key("url")
    String url();

}
