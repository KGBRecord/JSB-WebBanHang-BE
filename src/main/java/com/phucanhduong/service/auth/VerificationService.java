package com.phucanhduong.service.auth;

import com.phucanhduong.dto.authentication.RegistrationRequest;
import com.phucanhduong.dto.authentication.ResetPasswordRequest;
import com.phucanhduong.dto.authentication.UserRequest;

public interface VerificationService {

    Long generateTokenVerify(UserRequest userRequest);

    void resendRegistrationToken(Long userId);

    void confirmRegistration(RegistrationRequest registration);

    void changeRegistrationEmail(Long userId, String emailUpdate);

    void forgetPassword(String email);

    void resetPassword(ResetPasswordRequest resetPasswordRequest);

}
