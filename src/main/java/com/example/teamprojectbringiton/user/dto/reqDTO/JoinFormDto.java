package com.example.teamprojectbringiton.user.dto.reqDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinFormDto {

    private String username;
    private String password;
    private String userEmail;
    private String userPhoneNumber;
    private String userAddress;
    private boolean isAdmin;

}
