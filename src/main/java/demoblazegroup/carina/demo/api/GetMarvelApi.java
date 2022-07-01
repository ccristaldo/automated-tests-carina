package demoblazegroup.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url= "${base_url}/v1/public/characters?name=iron man&apikey=bbc8698be2f66bacea8539c4228f27e7&hash=9033d3960f625a607ed18eeb6d276617&ts=1", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/marvel/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetMarvelApi extends AbstractApiMethodV2 {
    public GetMarvelApi() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
