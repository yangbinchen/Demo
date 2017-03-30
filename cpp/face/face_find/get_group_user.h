//
// Created by Wang,Jian(BNBPRD) on 17/3/22.
//

#ifndef CPP_GET_GROUP_USER_H
#define CPP_GET_GROUP_USER_H
#include <string>
int get_group_user(std::string &json_result, const std::string &group_id, const std::string &access_token, int start = 0, int end = 100);

#endif //CPP_GET_GROUP_USER_H
