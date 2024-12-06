package com.jsb.service.auth;

import com.jsb.dto.authentication.RegistrationRequest;
import com.jsb.dto.authentication.ResetPasswordRequest;
import com.jsb.dto.authentication.UserRequest;

public interface VerificationService {

    Long generateTokenVerify(UserRequest userRequest);

    void resendRegistrationToken(Long userId);

    void confirmRegistration(RegistrationRequest registration);

    void changeRegistrationEmail(Long userId, String emailUpdate);

    void forgetPassword(String email);

    void resetPassword(ResetPasswordRequest resetPasswordRequest);

}
