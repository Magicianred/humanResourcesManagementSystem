package hrms.humanResourcesManagementSystem.business.abstracts;

import java.util.List;

import hrms.humanResourcesManagementSystem.core.utilities.DataResult;
import hrms.humanResourcesManagementSystem.core.utilities.Result;
import hrms.humanResourcesManagementSystem.entities.VerificationCode;

public interface VerificationCodeService {
	
	DataResult<List<VerificationCode>> getAll();
	DataResult<VerificationCode> get(int id);
	DataResult<VerificationCode> getByUserId(int userId);
	Result add(VerificationCode verificationCode);
	
}
