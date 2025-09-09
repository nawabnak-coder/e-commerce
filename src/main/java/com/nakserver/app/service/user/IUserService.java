package com.nakserver.app.service.user;

import com.nakserver.app.dto.UserDto;
import com.nakserver.app.model.User;
import com.nakserver.app.request.CreateUserRequest;
import com.nakserver.app.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
