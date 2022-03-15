package utiltemplatecontextcontributor.context.contributor;

import com.liferay.portal.kernel.template.TemplateContextContributor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ReleaseInfo;
import org.osgi.service.component.annotations.Component;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {"type=" + TemplateContextContributor.TYPE_GLOBAL},
	service = TemplateContextContributor.class
)
public class UtilTemplateContextContributorTemplateContextContributor
	implements TemplateContextContributor {

	@Override
	public void prepare(
		Map<String, Object> contextObjects, HttpServletRequest request) {

		//contextObjects.put("sample_text", "This is some sample text.");
		contextObjects.put("UtilContributor", this);
	}

	public String getVersion() {
		return ReleaseInfo.getVersion();
	}
	public int getBuildNumber() {
		return ReleaseInfo.getBuildNumber();
	}
	public int getParentBuildNumber() {
		return ReleaseInfo.getParentBuildNumber();
	}
	public String getName() {
		return ReleaseInfo.getName();
	}

	public String getCodeName() {
		return ReleaseInfo.getCodeName();
	}

	public String getReleaseInfo() {
		return ReleaseInfo.getReleaseInfo();
	}

}