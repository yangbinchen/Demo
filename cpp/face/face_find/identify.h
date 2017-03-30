//
// Created by Wang,Jian(BNBPRD) on 17/3/22.
//

#ifndef CPP_IDENTIFY_H
#define CPP_IDENTIFY_H
#include <string>
#include <vector>
int identify(std::string &json_result, const std::string &group_id, const std::vector<std::string> &images, const std::string &access_token, int user_top_num = 1, int face_top_num = 1);

#endif //CPP_IDENTIFY_H
