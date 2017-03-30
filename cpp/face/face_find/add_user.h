//
// Created by Wang,Jian(BNBPRD) on 17/3/22.
//

#ifndef CPP_ADD_USER_H
#define CPP_ADD_USER_H

#include <string>
#include <vector>

int add_user(std::string &json_result, const std::string &uid, const std::string &user_info,
             const std::string &group_id, const std::vector<std::string> &images, const std::string &access_token);

#endif //CPP_FACE_FIND_H
